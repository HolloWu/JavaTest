package JavaHomework;

import java.io.*;

public class HW07_5 {
	public static void main(String[] args)throws Exception {
		File obj = new File("C:/data/Object.ser");
		FileInputStream fis = new FileInputStream(obj);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(obj.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((Pet) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
	}
}
