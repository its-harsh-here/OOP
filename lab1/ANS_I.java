package lab1;
import java.util.Scanner;

public class ANS_I 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number a and number n: ");
		int a = in.nextInt(), n = in.nextInt();
		System.out.println("Multiplying a with 2n we get: " + (a << n));
		System.out.println("Dividing a with 2n we get: " + (a >> n));
	}
}
