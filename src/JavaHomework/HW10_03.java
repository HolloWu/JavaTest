package JavaHomework;
//• 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成(1)
//年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖
//(提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法)

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HW10_03 {
	public static void main(String[] args) throws ParseException {
		String regex1 = "^\\d{8}$";
		String regex2 = "^[1-3]$";
		Scanner sc = new Scanner(System.in);

		System.out.print("請輸入日期(年月日，例如:20110131):");
		String num;
		while (!(num = sc.next()).matches(regex1)) {
			System.out.println("數字格式不正確，請再輸入一次!");
			System.out.print("請輸入日期(年月日，例如:20110131):");
		}
		
		System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年:");
		String formatSelector;
		while (!(formatSelector = sc.next()).matches(regex2)) {
			System.out.println("數字格式不正確，請再輸入一次!");
			System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年:=");
		}
		Date date = new SimpleDateFormat("yyyyMMdd").parse(num);
		
		switch (formatSelector) {
		case "1":
			Format sfm1 = new SimpleDateFormat("yyyy/MM/dd");
			System.out.println("年/月/日: " + sfm1.format(date));
			break;
		case "2":
			Format dfm2 = new SimpleDateFormat("MM/dd/yyyy");
			System.out.println("月/日/年: " + dfm2.format(date));
			break;
		case "3":
			Format dfm3 = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("日/月/年: " + dfm3.format(date));
			break;
		}
		sc.close();
	}
}
