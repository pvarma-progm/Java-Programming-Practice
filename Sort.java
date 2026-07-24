// Sorting of element
class Sort
{
	private static void sort(int[] A)
	{
		for(int i =0; i<A.length-1; i++)
		{
			for(int j = i+1; j<A.length; j++)
			{
				if(A[i] > A[j])
				{
					int temp = A[i];
					    A[i] = A[j];
					    A[j] = temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		int[] A={44,55,22,11,33};
		System.out.print("The array before sorting [");
		for(int i =0; i< A.length; i++)
			{
				if(i < A.length-1)
					System.out.print(A[i]+ ",");
				else
					System.out.print(A[i]+ "]");
			}
		sort(A);
		System.out.print("\nThe array after sorting [");
		for(int i =0; i< A.length; i++)
			{
				if(i < A.length-1)
					System.out.print(A[i]+ ",");
				else
					System.out.print(A[i]+ "]");
			}
	}
}


	