package JavaHomework;

import java.util.Scanner;

//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形，如圖示結果：
//(進階功能：加入直角三角形的判斷)

public class HW03_1 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入三個邊:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	
		if(a==b&&b==c&&a==c) {
			System.out.println("正三角形");
		}else if(a==0||b==0||a==0) {
			System.out.println("不是三角形");
		}else if((a*a+b*b)==c*c || (b*b+c*c)==(a*a) || (c*c+b*b)==a*a) {
			System.out.println("直角三角形");
		}else if(a==b||b==c||c==a){
			System.out.println("等腰三角形");
		}else{
			System.out.println("三角形");
		}
	}
}
