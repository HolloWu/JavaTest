package JavaHomework;

import java.util.Scanner;

public class HW04_4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int colleague[][]= { {25, 32, 8, 19, 27}, {2500, 800, 500, 1000, 1200} };
		int x, count=0;
		
		System.out.println("請輸入整數金額：");
		
		if(sc.hasNextInt()) {
			x=sc.nextInt();
			System.out.print("可借錢的員工編號\n");
			
			for(int i=0;i<colleague[1].length;i++) {
				if(colleague[1][i] >= x) {
					System.out.print(colleague[0][i]+"\t");
					count++;
				}
			}
			System.out.println("\n共 "+ count +" 人");
		}else {
			System.out.print("輸入錯誤");
		}
	}
}


