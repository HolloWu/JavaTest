package JavaHomework;
//• 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//代表的檔案會複製到第二個參數代表的檔案

import java.io.*;

public class HW07_3 {
	public static void main(String[]args) throws IOException {
		File f1 = new File("files/Sample.txt");
		File f2 = new File("files/CopyFile.txt");
		
		
		copyFile(f1,f2);
	}
	
	public static void copyFile(File f1, File f2) throws IOException {
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		int i;
		
		while ((i = br.read()) != -1) { 
			fw.write(i);
			fw.flush();
		}
		bw.close();br.close();fw.close();fr.close();
	}
	
}
