package JavaHomework;

public class HW05_2 {

	public static void avgRand() {
		int sum=0;
		for(int i=0;i<=10;i++) {
			int r=(int)(Math.random()*101);
			System.out.print(r+"\t");
			sum+=r;
		}
		System.out.print("\n平均:"+sum/10);
	}
	
	public static void main(String[] args) {
		avgRand();
		
	}
	
}
