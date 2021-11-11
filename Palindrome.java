class Palindrome {
	public static void main(String a[]){
	Palindrome s1=new Palindrome();
	s1.palindrome();
}
void palindrome()
{
	int n=11, reversed = 0, remainder, original;
	original = n;
	System.out.println("The number is :"+n);
	    while (n != 0) {
	        remainder = n % 10;
	        reversed = reversed * 10 + remainder;
	        n /= 10;
	    }
	    if (original == reversed)
	        System.out.println("The given number " +original+" is a palindrome.");
	    else
        	System.out.println("The given number " +original+" is not a palindrome.");
}
}
