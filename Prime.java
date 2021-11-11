class Prime {
	public static void main(String a[]){
	Prime s1=new Prime();
	s1.checking();
}
void checking()
{
	int num = 5, flag = 0;
	   for(int i=2 ; i < num/2 ; i++) {
	      if(num%i == 0) {
	         System.out.println("It is not a prime number");
	         flag = 1;
	         break;
	      }
	   }
	   if(flag == 0) {
	      System.out.println("It is a prime number");
   	   }
}
}