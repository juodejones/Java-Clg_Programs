package AbstractClasses;

public class Rectangle extends Shape {

	public Rectangle(int length, int breadth){
		a = length;
		b = breadth;
	}

	public int printArea(){
		System.out.println("Area of the rectangle : " + a*b);
		return a*b;
	}
}