package JavaHomework;

import java.util.Scanner;

public class HW03_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=0;
		int[] x=new int[49];
		int[] y=new int[50];
		int f=sc.nextInt();
		
		for(int i=0;i<x.length;i++) {
			x[i]=i+1;
		}
		
		System.out.println("可選數字");
		for(int i=0;i<x.length;i++) {
			if(x[i]%10 != f && x[i]/10 != f) {
				y[i]=x[i];
				if(y[i]<10) {
					System.out.printf("0"+y[i]+"\t");
				}else{
					System.out.printf(y[i]+"\t");
					}
				count++;
			}
		}
		System.out.println("\n總數");
		System.out.println(count);
		
		System.out.println("自動選號");
		count=0;
		do{
		int p=(int)(Math.random()*50);
			if(y[p] != 0) {
				if(y[p]<10) {
					System.out.print("0"+y[p]+"\t");
				}else{
					System.out.print(y[p]+"\t");
				}
				y[p]=0;
				count++;
			}
		}while(count<=5);
	}
}
