// Given an array , shift array element left by 1
class RotateLeft
{
	private static void rotateLeft(int A[])
	{
		int ele = A[0];
		for(int i = 0; i<A.length; i++)
		{
			if(i<A.length-1)
				A[i] = A[i+1];
			else
				A[i] = ele;
		}
	}
	public static void main(String args[])
	{
		int[] A={1,2,3,4,5};
			System.out.print("Array Before Rotate [");
		for(int i=0; i<A.length; i++)
		{
			if(i<A.length-1)
				System.out.print(A[i]+",");
			else
				System.out.print(A[i]+"]");
		}
		rotateLeft(A);
			System.out.print("\nArray After Rotate [");
		for(int i=0; i<A.length; i++)
		{
			if(i<A.length-1)
				System.out.print(A[i]+",");
			else
				System.out.print(A[i]+"]");
		}

	}
}