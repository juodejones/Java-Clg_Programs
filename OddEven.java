class OddEven{
	public static void main(String[] args){
		OddEven num = new OddEven();
		num.oddOrEven();
	}

	void oddOrEven(){
		int num = 32;
		if ( num % 2 ==0 ) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}