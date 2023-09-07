package JavaHomework;

import java.util.Scanner;

public class Calculator {

		public void powerXY() throws CalException{
			Scanner sc = new Scanner(System.in);
			int x, y;
			
			System.out.print("請輸入x的值");
			x=sc.nextInt();
			System.out.print("請輸入y的值");
			y= sc.nextInt();
			
			if(x==0 && y==0) {
				throw new CalException("0的0次方沒有意義\n");
			}else if(y<0){
				throw new CalException("次方為負值，結果回傳不為整數！\n");
			}else{
				System.out.print(x+"的"+y+"次方等於"+Math.pow(x, y));
			}
			
			sc.close();
		}
}
