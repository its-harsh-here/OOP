package lab2;
import java.util.Scanner;

public class ANS_A 
{
	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter cost of ride: ");
		int c = in.nextInt();
		double d;
		if (c > 170)
			d = (c - 170) / 5.0 + 20;
		else if (c > 50)
			d = (c - 50) / 8.0 + 5;
		else
			d = c / 10.0;
		System.out.println(d + " Km");
	}
}
