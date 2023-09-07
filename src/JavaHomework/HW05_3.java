package JavaHomework;

public class HW05_3 {
	
	public static int maxElement(int[][] intArray) {
		int max=0;
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				if(intArray[i][j]>max) {
					max=intArray[i][j];
				}
			}
		}
		
		return max;
	}
	
	public static double maxElement(double[][] doubleArray) {
		double max=0;
		for(int i=0;i<doubleArray.length;i++) {
			for(int j=0;j<doubleArray[i].length;j++) {
				if(doubleArray[i][j]>max) {
					max=doubleArray[i][j];
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		HW05_3 w=new HW05_3();
		
		int[][] intArray= {{1, 6, 3}, {9, 5, 2}};
		double[][] doubleArray= {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
		
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}

}
