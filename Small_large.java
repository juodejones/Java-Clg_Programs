class Small_large {
	public static void main(String a[]){
	Small_large s1=new Small_large();
	s1.checking();
	}
void checking() {
    int i,n;
    int [] number={24,54,32,67,89,12};
    n=number.length;
    System.out.println("The elements in the array are:");
    for(i=0;i<n;i++)
    {
        System.out.println(""+number[i]);
    }
    int smallest=number[0],largest=number[0];
    for(i=0;i<n;i++)
    {
        if(smallest>number[i])
        {
            smallest=number[i];
        }
        if(largest<number[i])
        {
            largest=number[i];
        }
    }
    System.out.println("The smallest value is : "+smallest);
    System.out.println("The largest value is : "+largest);
	}
}
