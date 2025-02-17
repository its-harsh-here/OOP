package lab2;
import java.util.Scanner;

public class ANS_G 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt(), r = 0, a = n;
		while (a > 0)
		{
			r *= 10;
			r += a % 10;
			a /= 10;
		}
		if (n == r)
			System.out.println("The number is a Palindrome!");
		else
			System.out.println("The number is not a Palindrome!");
	}
}
