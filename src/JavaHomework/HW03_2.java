package JavaHomework;
//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：
//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)

import java.util.Scanner;

public class HW03_2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x;
		int r = (int)(Math.random()*101);
		System.out.println(r);
		
		do {
			System.out.println("請猜:");
			x = sc.nextInt();
			if(x>r) {
				System.out.println("猜大了");
			}else if(x<r) {
				System.out.println("猜小了");
			}
		}while(r != x);
		
		System.out.println("猜對囉...");
		
	}
}
