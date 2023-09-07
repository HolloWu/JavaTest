package JavaHomework;

import java.io.*;

public class HW07_4 {
	public static void main(String[] args)throws  Exception  {
		File data = new File("C:/data");
		if(!data.exists()) {data.mkdir();}
		File obj = new File("C:/data/Object.ser");
		Dog Dog1 = new Dog("Dog1");
		Dog Dog2 = new Dog("Dog2");
		Cat Cat1 = new Cat("Cat1");
		Cat Cat2 = new Cat("Cat2");
		
		
		FileOutputStream fos = new FileOutputStream(obj);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(Dog1);
		oos.writeObject(Dog2);
		oos.writeObject(Cat1);
		oos.writeObject(Cat2);
		
		oos.close();
		fos.close();
	}

}
