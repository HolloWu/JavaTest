package JavaHomework;

public class HW05_4 {

	public static void main(String[] args) {
		MyRectangle a=new MyRectangle();
		MyRectangle b=new MyRectangle(10, 20);
		
		a.setWidth(10);
		a.setDepth(20);
		
		System.out.println(a.getArea());
		System.out.println(b.getArea());
	}
	
}
