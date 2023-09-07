package JavaHomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//請自行建立一個文字檔Sample.txt，請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

public class HW07_1 {
	public static void main(String[] args) throws IOException{
		File dir=new File("");
		System.out.println("請將檔案放置下路徑"+dir.getAbsolutePath()); 
		//找到dir的絕對路徑，因為dir在宣告時沒有指定路徑，所以絕對路徑會是這個java檔所在的絕對路徑
		//將Sample.txt放到dir的絕對路徑下
		File dirSample=new File("files/Sample.txt");//用相對路徑找到files/Sample.txt檔
		int charCount=0, rowCount=0;
		
		FileReader frChar = new FileReader(dirSample);
//		BufferedReader brChar = new BufferedReader(frChar);
		int i;
		while ((i = frChar.read()) != -1) {
			charCount++;
		}
		
		FileReader frRow = new FileReader(dirSample);
		BufferedReader brRow = new BufferedReader(frRow);//BufferReader才有readLine()回傳String
		String str;
		while ((str = brRow.readLine()) != null) {
		rowCount++;
		}
		
		System.out.print("Sample.txt檔案共有"+dirSample.length()+"個位元組，"+charCount+"個字元，"+rowCount+"列資料\r\n");
	}
}
