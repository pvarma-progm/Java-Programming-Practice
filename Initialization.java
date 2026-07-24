// The code for Initialization of Array
class Initialization
{
	public static void main(String args[])
	{
	int [] A = {-5,-4,3,2,4,0,1,5,7};
	       
		System.out.println("Length of an array:"+A.length);
		System.out.println("Element at position 5 is:"+A[4]);
		System.out.print("All Elements are [");
	
	for(int i=0;i<A.length;i++)
	{
		if(i<A.length-1)
			System.out.print(A[i]+ ",");
		else
			System.out.print(A[i]+"]");
	}
	
	}
}