package JavaHomework;

public class HW04_1 {

	public static void main(String[] args) {
			int[] x = {29, 100, 39, 41, 50, 8, 66, 79, 95, 15};
			int sum = 0;
			double avg;
			for(int i=0;i<x.length;i++) sum +=x[i];
			avg=sum/10;

			System.out.println("平均:"+avg);
			
			for(int i=0;i<x.length;i++) {
				if(x[i]>avg) {
					System.out.print(x[i]+"\t");
				}
			}
	}

}
