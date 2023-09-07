package JavaHomework;

public class HW01 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		System.out.println("請設計一隻Java程式，計算12，6這兩個數值的和與積");
		int a = 12, b = 6;
		System.out.println("12與6的和=" + (a+b) + "\n12與6的積=" + a*b);
		
//		• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		System.out.println("\n請設計一隻Java程式，計算200顆蛋共是幾打幾顆？");
		int c=200;
		System.out.println("200顆雞蛋總共是" + (int)c/12 + "打"+c%12+"顆");
		
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		System.out.println("\n請由程式算出256559秒為多少天、多少小時、多少分與多少秒？");
		int m=60, h=m*60, d=h*24, s=256559;
		System.out.println("256559秒為 " + (int)s/d + " 天 " + (int)(s%d)/h + " 小時 " + (int)(s%d%h)/m + " 分鐘 " + s%d%h%m + " 秒");
		
//		• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		System.out.println("\n請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長");
		double PI=3.1415;
		int r=5;
		System.out.println("圓面積為：" + r*r*PI +"\n圓周長為：" + 2*r*PI);
		
//		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		System.out.println("\n某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢？");
		double deposit=1500000, rate=0.02;
		for(int i=1; i <=10 ;i++)
			deposit=deposit*(1+rate);
		System.out.println("10年後，本金加利息共有 "+(int)deposit+" 元");
		
//		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
		System.out.println("\n請寫一隻程式，利用System.out.println()印出以下三個運算式結果：5 + 5, 5 + ‘5’, 5 + “5”");
		System.out.println(5+5); //數值運算5+5 = 10
		System.out.println(5+'5');//數值運算5+char'5'(Unicode中，符號'5'的編號是十六進位的0x0035，換算成十進位為53) = 5+53 = 58
		System.out.println(5+"5");//字串5跟5串接->55
//		並請用註解各別說明答案的產生原因

	}
}

