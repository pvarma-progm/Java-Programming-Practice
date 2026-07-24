//Find out the prime number from the given array and find the count of it
class PrimeNumb
{
	public static void main(String args[])
	{
		int[] A ={1,2,3,4,5,6,7,8,9};
		for(int i=0; i<A.length; i++) // for traverse
		{
			if(A[i] <= 1)
			continue;
			
			int count = 0;
			for(int j=2; j<=A[i]/2; j++) // check condn for prime num
			{
				if(A[i] % j == 0)
				{
				count++;
				}
			}
		
			if(count == 0)
				System.out.println(A[i]);
			
		}
		
	}
}

/*
here outer loop used for traverse
(i=0 ; i<8 ; i++)
 if (A[0] <=1)
     {1 <= 1} true
then i =1
A[1] = 2
 {2 <= 1} false
c=0
inner for check prime num
(j=2; j<= A[i]/2; j++) // j<= 2/2= 1; here 2<=1 false  ---it is prime
	if(A[i] % j == 0)
 	count++  means count = 1
or count still = 0 
then
print 2
*/