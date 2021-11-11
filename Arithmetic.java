class Arithmetic{
	public static void main(String[] args) {
			Arithmetic a1 = new Arithmetic();
	        a1.add();
	        a1.sub();
	    }

	    void add() {
	        int a=10,b=20,c;
	        c=a+b;
	        System.out.println("The sum value is:"+c);
	    }
	    void sub() {
	        int a = 10, b =4;
	        System.out.println(a + " - " + b + " = " + (a-b));
    }
}