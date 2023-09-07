package JavaHomework;

import java.util.Scanner;

public class HW05_1 {
	
	public int width;
	public int height;
	
	public static void starSquare(int height, int width) {
		for(int i=0;i<height;i++) {
			for(int j=0;j<=width;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		System.out.println("請輸入高跟寬");
		 starSquare(h, w);
		
	}
}
