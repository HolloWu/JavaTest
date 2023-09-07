package JavaHomework;

import java.io.PrintWriter;

//• 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//1000元,寫一個Java程式模擬匯款10次與提款10次的情
//形。
//• 參考範例：TestWaitNotify.java

public class HW09_2 {
	public static boolean isCompleted = false;
	
	public static void main(String args[]) {
		Account acc = new Account();
		Mom mom = new Mom(acc, "媽媽");
		Son son = new Son(acc, "\t\t\t熊大");
		Thread momThd = new Thread(mom);
		Thread sonThd = new Thread(son);
		
		System.out.println("起始餘額：" + acc.getBalance() + "\n==========");
		momThd.start();
		sonThd.start();

		try {
			momThd.join();
			sonThd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("程式結束");
	}
}

class Account {
	private int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}
}

class Mom implements Runnable {
	Account acc;
	String name;

	Mom(Account acc, String name) {
		this.acc = acc;
		this.name = name;
	}
	
	public void support() {
		while (acc.getBalance() > 3000) {
			if (HW09_2.isCompleted == true) {
				return;
			}
			System.out.println(name + "看到餘額在3000以上，停止匯款");
			try {
				acc.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}			
		acc.deposit(2000);
		System.out.println(name + "存了2000，帳戶共有：" + acc.getBalance());
		acc.notify();
//		System.out.println("熊大被老媽告知帳戶已經有錢！");
	}

	public void run() {
		for (int i = 1; i < 100; i++) {
			if (HW09_2.isCompleted == true) {
				break;
				}
//			System.out.println(name + "的回合======" + i);
			synchronized (acc) {
				support();
			}
		}
		HW09_2.isCompleted = true;
//		System.out.println("媽媽執行完成");
	}
}

class Son implements Runnable {
	Account acc;
	String name;

	Son(Account acc, String name) {
		this.acc = acc;
		this.name = name;
	}

	public void expense() {			
		while (acc.getBalance() < 1000) {
			if (HW09_2.isCompleted == true) {
				return;
			}
			System.out.println(name + "看到帳戶沒錢，暫停提款");
			try {
				acc.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		acc.withdraw(1000);
		System.out.println(name + "領了1000，帳戶共有：" + acc.getBalance());
		if (acc.getBalance() < 2000) {
			System.out.println(name + "看到餘額在2000以下，要求匯款");
			acc.notify();
//			System.out.println("\t\t\t媽媽被熊大要求匯款！");
		}
		acc.notify();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (HW09_2.isCompleted == true) {
				break;
			}
//			System.out.println(name + "的回合======" + i);
			synchronized (acc) {
				expense();
			}
		}
		HW09_2.isCompleted = true;
//		System.out.println("熊大執行完成");
	}
}
