package JavaHomework;

public class HW05_5 {
	

	public static void main(String[] args) {
		
		genAuthCode();
	}

	public static void genAuthCode() {

		for (int i = 0; i < 8; i++) {
			switch ((int) (Math.random() * 3)) {
				case 0: 
					System.out.print((char)(int) (Math.random() * 26+97));
				break;
				case 1: 
					System.out.print((char)(int) (Math.random() * 26+65));
				break;
				case 2: 
				System.out.print((char)(int) (Math.random() * 10+48));
				break;
			}
		}
	}
	
}
