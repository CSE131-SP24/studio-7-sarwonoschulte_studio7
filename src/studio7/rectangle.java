package studio7;

public class rectangle {

	private double length;
	private double width;
	private int x;
	private int y;
	private String color;
	
public rectangle (int x, int y, double w, double l, String color) {
	this.length = x;
	this.length = y;
	this.color = color;
	this.width = w;
	this.length = l;
}
public String getDimensions() {
	return this.length + "" + this.width;
}
public static void main(String args[]) {
	rectangle march = new rectangle(1,1,5,5,"BLUE");
	System.out.print(march.getDimensions()); 
	}
	 
 
}

