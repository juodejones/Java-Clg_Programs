class Swapping{
	public static void main(String[] args){
		Swapping a = new Swapping();
		a.swap();
	}

	void swap(){
		int a = 6, b = 47, temp;
		System.out.println("Before Swapping, \n\ta = " + a + "\tb = " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping, \n\ta = " + a + "\tb = " + b);
	}
}
