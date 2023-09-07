package JavaHomework;
//• 請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
//為質數 (提示：Math類別)

public class HW10_01 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100 + 1);
			System.out.println(num + (isPrime(num) ? "是" : "不是") + "質數");
		}

	}

	static boolean isPrime(int num) {
		if ( num == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++)
			if (num % i == 0)
				return false;
		return true;
	}
}
