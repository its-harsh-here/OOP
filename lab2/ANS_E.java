package lab2;
import java.util.Scanner;

public class ANS_E 
{
	static int fact(int n)
	{
		if (n == 0 || n == 1)
			return 1;
		return n * fact(n - 1);
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		System.out.print("Factorial of " + n + " is " + fact(n));
	}
}
