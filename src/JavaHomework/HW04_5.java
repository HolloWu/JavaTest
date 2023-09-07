package JavaHomework;

import java.util.Scanner;

public class HW04_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] mDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days=0;

		System.out.println("請輸入西元YYYY年MM月DD日:");
		int yyyy = sc.nextInt();
		int mm = sc.nextInt();
		int dd = sc.nextInt();

		if(isRuen(yyyy)) {
			mDays[1] = 29;
		}
		
		if (dd <= mDays[mm - 1]) {
			for (int i = 0; i < (mm - 1); i++) {
				days += mDays[i];
			}
			System.out.println("\n為該年的第" + (days + dd) + " 天");
		} else {
			System.out.println("日期錯誤，請重新輸入");
		}
	}
	
	public static boolean isRuen(int yyyy) {
		return (yyyy % 4 == 0 && yyyy % 100 != 0) || yyyy % 400 == 0;
	}
	
//	public static void main2(String[] args) {
//		System.out.println(isRuen(2020));
//		System.out.println(isRuen(2021));
//		System.out.println(isRuen(2022));
//		System.out.println(isRuen(2023));
//		System.out.println(isRuen(2024));
//	}
	
}
