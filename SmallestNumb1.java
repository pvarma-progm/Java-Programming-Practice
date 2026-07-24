import java.util.Scanner;
class SmallestNumb1
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of a b and c");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a<b && a<c)
		{
			System.out.println("Smallest is a");
		}
		else if(b<a && b<c)
		{
			System.out.println("Smallest is b");
		}
		else
		{
			System.out.println("Smallest is c");
		}
	}
}
		
