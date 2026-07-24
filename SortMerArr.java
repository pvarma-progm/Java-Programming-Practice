// Given array A and B sort them and merge as well
class SortMerArr
{
	private static void sortMerge(int[] A, int[] B)
	{
		int[] C = new int[A.length + B.length]; // empty array
		int index = 0;

		for(int i = 0; i<C.length; i++) //merge
		{
			if(i<A.length)
				C[i] = A[i];
			else
				C[i] = B[index++];
		}
		System.out.print("\nThe array after merge is ["); // print of merge

		for(int i =0; i< C.length; i++)
			{
				if(i < C.length-1)
					System.out.print(C[i]+ ",");
				else
					System.out.print(C[i]+ "]");
			}
	


		for(int i =0; i<C.length-1; i++) // for sorting array after merge
		{
			for(int j = i+1; j<C.length; j++)
			{
				if(C[i] > C[j])
				{
					int temp = C[i];
					    C[i] = C[j];
					    C[j] = temp;
				}
			}
		}
		System.out.print("\nThe array after sorting [");
		for(int i =0; i< C.length; i++)
			{
				if(i < C.length-1)
					System.out.print(C[i]+ ",");
				else
					System.out.print(C[i]+ "]");
			}
		
	}

	public static void main(String args[])
	{
		int[] A={2,4,6,8,10};
		int[] B={1,3,5,7};
		System.out.print("The array Before merge is [");
		for(int i =0; i< A.length; i++)
			{
				if(i < A.length-1)
					System.out.print(A[i]+ ",");
				else
					System.out.print(A[i]+ "]");
			}
		System.out.print("[");
		for(int i =0; i< B.length; i++)
			{
				if(i < B.length-1)
					System.out.print(B[i]+ ",");
				else
					System.out.print(B[i]+ "]");
			}
			sortMerge(A,B);
		

	}

}
		
	

		


	