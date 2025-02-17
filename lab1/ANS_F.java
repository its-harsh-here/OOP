package lab1;
import java.util.Scanner;

public class ANS_F 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter values of a and b: ");
		int a = in.nextInt(), b = in.nextInt();
		System.out.println("(a << 2) + (b >> 2) = " + (a << 2) + (b >> 2)); // a
		System.out.println("((b > 0) = " + (b > 0)); // b
		System.out.println("(a + b * 100) / 10 = " + (a + b * 100) / 10); // c
		System.out.println("a & b = " + (a & b)); // d
	}
}
