package AbstractClasses;

public class Triangle extends Shape {

	public Triangle(int height, int breadth){
		a = height;
		b = breadth;
	}

	public int printArea(){
		System.out.println("Area of the Triangle : " + 0.5*a*b);
		return (int) 0.5*a*b;
	}
}