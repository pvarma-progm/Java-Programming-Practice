// Given array , Right shift array element right by 1
class RotateRight
{
	private static void rotateRight(int A[])
	{
		int ele = A[A.length-1];
		for(int i = A.length-1; i>0; i--)
		{
			A[i] = A[i-1];
		}
			A[0] = ele;
		
	}
	public static void main(String args[])
	{
		int[] A={1,2,3,4,5};
			System.out.print("Array Before Rotate [");
		for(int i=0; i < A.length; i++)
		{
			if(i < A.length-1)
				System.out.print(A[i]+",");
			else
				System.out.print(A[i]+"]");
		}
		rotateRight(A);
			System.out.print("\nArray After Rotate [");
		for(int i=0; i < A.length; i++)
		{
			if(i < A.length-1)
				System.out.print(A[i]+",");
			else
				System.out.print(A[i]+"]");
		}

	}
}