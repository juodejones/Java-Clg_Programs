class Fibanocci {
	public static void main(String a[]){
	Fibanocci s1=new Fibanocci();
	s1.Fibanocci_series();
	}
void Fibanocci_series() {
	int i,number=10,n1=0,n2=1,n3;
	System.out.println(n1);
	System.out.println(n2);
	for(i=2;i<number;i++) {
	    n3=n1+n2;
	    System.out.println(n3);
	    n1=n2;
	    n2=n3;
        }
	}
}