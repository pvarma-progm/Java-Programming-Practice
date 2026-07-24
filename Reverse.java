	// Enter any 5 digit number, find out the reverse of that
import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
 		System.out.println("Enter any 5 digit number");
		int num = scan.nextInt();
		int r1 = num % 10;
		num = num/10;
		int r2 = num % 10;
		num = num/10;
		int r3 = num % 10;
		num = num/10;
		int r4 = num % 10;
		num = num/10;
		int r5 = num % 10;
		int rev = r1*10000 + r2*1000 + r3*100 + r4*10 + r5*1;
		System.out.println("Reverse of above 5 digit number is:"+rev);
	}
}