package JavaHomework;
//• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//競賽過程。
//• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//• 參考範例：CounterRunnable.java
//• 需留意主執行緒執行順序

public class HW09_1{
	public static boolean ready;

	public static void main(String[] args) {
		bigEater bun = new bigEater("饅頭人",10);
		Thread bunThd=new Thread(bun);
		bigEater james = new bigEater("詹姆士",10);
		Thread jamesThd=new Thread(james);
		
		System.out.println("-----大胃王快食比賽開始!-----");
		bunThd.start(); 
		jamesThd.start();
		ready=true;
		try {
			bunThd.join();
			jamesThd.join();
		} catch (InterruptedException e) {
		}
		System.out.println("-----大胃王快食比賽結束!-----");
	}
}

class bigEater implements Runnable {
	private String name;
	private int rice;
	
	bigEater(String name, int rice) {
		this.name = name;
		this.rice = rice;
	}
	
	public void run() {
		while(!HW09_1.ready) {//用無限Loop卡住所有執行run方法的Thread，等待HW09_1.ready變成true
		}
		for (int i = 1; i <= rice; i++) {
			try {
				Thread.sleep((int)(Math.random()*2501+500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "吃第" + i + "碗飯");
		}
		System.out.println(name + "吃完了!");
	}
}
