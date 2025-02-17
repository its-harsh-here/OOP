package lab1;
import java.util.Scanner;

public class ANS_J 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 3 numbers: ");
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		int max = a >= b && a >= c ? a : b >= a && b >= c ? b : c;
		int min = a <= b && a <= c ? a : b <= a && b <= c ? b : c;
		System.out.println("Largest Number: " + max + "\n" + "Smallest Number: " + min);
	}
}
