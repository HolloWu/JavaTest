package JavaHomework;
//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
//append功能讓每次執行結果都能被保存起來)

import java.io.BufferedWriter;
//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HW07_2 {
	
	public static void main(String[] args) throws IOException{
		FileWriter fwData = new FileWriter("files/Data.txt",true);
		BufferedWriter bwData = new BufferedWriter(fwData);
//		PrintWriter pwData = new PrintWriter(bwData);
		int i=0;
		
		while(i<10) {
			int r =(int)(Math.random()*1000)+1;
			fwData.write(r+"\t");
//			pwData.print(r+"\t");
			System.out.print(r+"\t");
			System.out.flush();
			i++;
		}
		fwData.write("\n");
		
//		pwData.close();
		bwData.close();fwData.close();
	}

}
