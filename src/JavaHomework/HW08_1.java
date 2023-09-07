package JavaHomework;

//• 請建立一個Collection物件並將以下資料加入：
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)
//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功

import java.math.BigInteger;
import java.util.*;

public class HW08_1 {
	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		//使用Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------");
		//使用for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println( ((ArrayList)list).get(i) );
		}
		System.out.println("----------------------------------------");
		//使用for each loop
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("----------------------------------------");
		
		int i = 0;
		while (i < list.size()) {
			if ( !( ((ArrayList)list).get(i) instanceof Number) ) {
				list.remove(((ArrayList)list).get(i));
			} else
				i++;
		}
		
		for (Object obj : list)
			System.out.println(obj);
		
//List中的物件Object()被刪除後，List會縮排但是for loop的i值依然在增加，導致跳號沒刪除到"Snoopy"
//		for(int i=0;i<list.size();i++) {
//		if (!(list.get(i) instanceof Number))
//			list.remove(list.get(i));
//		}
	}
}
