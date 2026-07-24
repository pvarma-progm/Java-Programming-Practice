// Find out the count of even and odd numbers for given data
class oddEven
{
	public static void main(String args[])
	{
		int Evencount = 0;
		int Oddcount = 0;
		int[] A={1,2,3,4,5,6,7,8,9};
			System.out.println("Length of an array:"+A.length);
		for(int i =0;i<A.length;i++)
		{
			if(A[i]%2==0)
				Evencount = Evencount+1;
			else
				Oddcount = Oddcount+1;
		}
		System.out.println("Count of Even numbers are:"+Evencount);
		System.out.println("Count of Even numbers are:"+Oddcount);
	}
}