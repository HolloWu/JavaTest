package JavaHomework;

public class HW02 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum2to1000 = 0;
		for (int i = 0; i <= 500; i++)
			sum2to1000 += i * 2;
		System.out.println(sum2to1000 + "\n");

//		• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int multi1to10f = 1;
		for (int i = 1; i <= 10; i++)
			multi1to10f *= i;
		System.out.println(multi1to10f + "\n");

//		• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int multi1to10w = 1, x = 1;
		while (x <= 10) {
			multi1to10w *= x;
			x++;
		}
		System.out.println(multi1to10w + "\n");

//		• 請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		int pow;
		for (int powi = 1; powi <= 10; powi++) {
			pow = powi * powi;
			System.out.print(pow + "\t");
		}
		System.out.println("\n");

//		• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		for (int n1to49 = 1; n1to49 <= 49; n1to49++) {
			if (n1to49 % 10 == 4) {
				continue;
			} else if (n1to49 > 39) {
				continue;
			} else {
				System.out.print(n1to49 + "\t");
			}
		}
		System.out.println("\n");

//		• 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6 
//		1 2 3 4 5
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1
		for (int numi = 10; numi > 0; numi--, System.out.println())
			for (int numj = 1; numj <= numi; numj++) {
				System.out.print(numj);
			}
		System.out.println();

//		• 請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
//		char abc = 'A';
//		for(int abci = 1; abci <= 6; abci++) {
//			for(int abcj = 65; abcj <abc+abci; abcj++) {
//				System.out.print(abc);
//			}
//			System.out.println();
//			abc++;
//		}
//		
//		for (char i = 'A'; i <= 'F'; i++, System.out.println())
//		for (int j = 'A'; j <= i; j++)
//			System.out.print(i);
//
//		for (int abci = 65; abci <= 70; abci++, System.out.println())
//			for (int abcj = 0; abcj <= (abci - 65); abcj++)
//				System.out.print((char) abci);
	}
}
