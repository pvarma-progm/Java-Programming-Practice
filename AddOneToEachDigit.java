// Let Us C Book Page No. 47 Question m
import java.util.Scanner;

class AddOneToEachDigit
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a five-digit number:");
        int num = scan.nextInt();

        int d1, d2, d3, d4, d5;
        int newNum;

        // Extract digits
        d5 = num % 10;
        num = num / 10;

        d4 = num % 10;
        num = num / 10;

        d3 = num % 10;
        num = num / 10;

        d2 = num % 10;
        num = num / 10;

        d1 = num % 10;

        // Add 1 to each digit
        d1 = (d1 + 1) % 10;
        d2 = (d2 + 1) % 10;
        d3 = (d3 + 1) % 10;
        d4 = (d4 + 1) % 10;
        d5 = (d5 + 1) % 10;

        // Form the new number
        newNum = d1 * 10000 + d2 * 1000 + d3 * 100 + d4 * 10 + d5;

        System.out.println("New Number = " + newNum);
    }
}