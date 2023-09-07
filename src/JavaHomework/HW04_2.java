package JavaHomework;

public class HW04_2 {

	public static void main(String[] args) {
		String S="Hello World";
		char[] charS=	S.toCharArray();
		
		for(int i=charS.length-1;i>=0;i--) {
			System.out.print(charS[i]);
		}

	}
}
