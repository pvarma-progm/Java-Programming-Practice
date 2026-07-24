//Find out the Summation of all Elements from the given array
class Summation
{
	public static void main(String args[])
	{
		int Sum = 0;
	
		int[] A={ -5,-4,3,2,4,0,1,5,7};
		for(int i=0;i<A.length;i++)
		{
			Sum = Sum + A[i];
		}
			double Avg = (double)Sum/A.length;
			System.out.println("The summation of all elements are:"+Sum);
			System.out.println("The summation of all elements are:"+Avg);

	}
}