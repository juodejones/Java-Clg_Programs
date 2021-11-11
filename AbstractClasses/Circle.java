package AbstractClasses;

import java.lang.*;

public class Circle extends Shape {

	public Circle(int radius){
		a = radius;
	}

	public int printArea(){
		System.out.println("Area of the Circle : " + Math.PI*a*a);
		return (int)Math.PI*a*a;
	}
}