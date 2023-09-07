package JavaHomework;
//• 請設計一個Train類別，並包含以下屬性：
//- 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
//- 目的地 dest，型別為String - 票價 price，型別為double
//• 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
//需使用的集合裡
//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//- (118, “自強”, “高雄”, “台北”, 500)
//- (1288, “區間”, “新竹”, “基隆”, 400)
//- (122, “自強”, “台中”, “花蓮”, 600)
//- (1222, “區間”, “樹林”, 七堵, 300)
//- (1254, “區間”, “屏東”, “基隆”, 700)

//• 請寫一隻程式，能印出不重複的Train物件
//• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
//• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
//• (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)

import java.util.*;

public class HW08_2 {
	public static void main(String[] args) {
		Train tr[] = new Train[7];
		tr[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		tr[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		tr[2] = new Train(118, "自強", "高雄", "台北", 500);
		tr[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		tr[4] = new Train(122, "自強", "台中", "花蓮", 600);
		tr[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		tr[6] = new Train(1254, "區間", "屏東", "基隆", 700);
		
		System.out.println("==================");
		System.out.println("不重複的Train物件(Set):");
		System.out.println("==================");
		Set<Train> set = new HashSet<Train>();
		for(int i =0 ;i<tr.length;i++) 
			set.add(tr[i]);
		//Iterator
		System.out.println("----------Iterator----------");
		Iterator<Train> itrSet = set.iterator();
		while (itrSet.hasNext()) 
			System.out.println(itrSet.next().getTrain());
		//For Loop
		System.out.println("----------For Loop----------");
		Object setArr[]=set.toArray();	//先把set用toArray()轉成array
		for(int i=0;i<set.size();i++) {		//再用for loop取值
			System.out.println(((Train)setArr[i]).getTrain());
		}
		//For-each
		System.out.println("----------For-each Loop----------");
		for(Train t:set)
			System.out.println(t.getTrain());
		
		System.out.println("=======================================");
		System.out.println("讓Train物件印出時，能以班次編號由大到小印出(List):");
		System.out.println("=======================================");
		List<Train> list = new ArrayList<Train>();
		for(int i =0 ;i<tr.length;i++) 
			list.add(tr[i]);
		Collections.sort(list);
		//Iterator
		Iterator<Train> itrList = list.iterator();
		System.out.println("----------Iterator----------:");
		while (itrList.hasNext()) 
			System.out.println(itrList.next().getTrain());
		//For Loop
		System.out.println("----------For Loop----------");
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).getTrain());
		}
		//For-each
		System.out.println("----------For-each Loop----------");
		for(Train t:list)
			System.out.println(t.getTrain());
		
		System.out.println("=======================================================");
		System.out.println("不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件(TreeSet):");
		System.out.println("=======================================================");
		Set<Train> treeset = new TreeSet<Train>();
		for(int i =0 ;i<tr.length;i++)
			treeset.add(tr[i]);
		//Iterator
		Iterator<Train> itrTreeSet = treeset.iterator();
		System.out.println("----------Iterator----------:");
		while (itrTreeSet.hasNext()) 
			System.out.println(itrTreeSet.next().getTrain());
		//For Loop
		System.out.println("----------For Loop----------");
		List<Train> listTreeSet=new ArrayList<Train>(treeset);
		for(int i =0;i<listTreeSet.size();i++) {
			System.out.println(listTreeSet.get(i).getTrain());
		}
		//For-each
		System.out.println("----------For-each Loop----------");
		for(Train t:treeset)
			System.out.println(t.getTrain());
	}
}
