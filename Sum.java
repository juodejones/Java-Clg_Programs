class Sum {
	public static void main(String a[]){
	Sum s1=new Sum();
	s1.sum();
	}
void sum() {
	int a=10,i,b=0;
	System.out.println("The value of a is:"+a);
	for(i=0;i<=a;i++)
		b+=i;
	System.out.println("The sum of all value is:"+b);
	}
}
