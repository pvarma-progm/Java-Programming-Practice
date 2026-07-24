// Find out the minimum array
class Minimun
{
	public static void main(String args[])
	{
		int[] A={9,5,10,15,8};
		int min = A[0];
		for(int i=1; i<A.length; i++)
		{
			if(A[i] < min)
				min = A[i];
		}
		System.out.println("Maximum = " + min);
	}
}