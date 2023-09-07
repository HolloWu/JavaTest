package JavaHomework;

public class HW04_6 {
	public static void main(String[] args) {
		int score[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int count[]=new int[8];
		int hScore, hNo;
		
		for (int i = 0; i < score.length; i++) {
			hScore = score[i][0];
			hNo = 0;
			for (int j = 1; j < score[i].length; j++)
				if (hScore < score[i][j]) {
					hScore = score[i][j];
					hNo = j;
				}
			count[hNo]++;
		}
		for(int i=0;i<8;i++)
			System.out.println( (i+1) + " 號學生的次數為：" + (count[i]) + "次");
	}
}
