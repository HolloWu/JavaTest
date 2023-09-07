package JavaHomework;

public class MyRectangle {
	double width, depth;
	
	void setWidth(double width) {
		this.width=width;
	}
	
	void setDepth(double depth) {
		this.depth=depth;
	}
	
	double getArea() {
		double area=0;
		area=width*depth;
		return area;
	}
	
	public MyRectangle(double width, double depth) {
		setWidth(width);
		setDepth(depth);
	}
	
	public MyRectangle() {
	
	}
}
