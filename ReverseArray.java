// Reverse the array eelements
class ReverseArray
{
	public static void main(String args[])
	{
		int[] A={10,20,30,40,50};
	
	System.out.print("The element before reverse[");
	
		for(int i=0; i<A.length; i++)
		{
			if(i<A.length-1)
				System.out.print(A[i]+",");
			else
				System.out.print(A[i]+"]");
		}
		System.out.print("\nThe elements After reverse[");
		for(int i=A.length-1; i>=0; i--)
		{
		
			if(i > 0)
				System.out.print(A[i]+",");
			else
				System.out.print(A[i]+"]");
		}
		

	}
}
		