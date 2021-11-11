class Swap {
	public static void main(String a[]){
	Swap s1=new Swap();
	s1.swap();
	}
void swap()	{
	int a=10,b=20,temp;
	System.out.println("Before swapping the a value is  " +a+ " and  b is value "+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("\nAfter swapping the a value is  "+a+ " and b is value "+b);
	}
}
