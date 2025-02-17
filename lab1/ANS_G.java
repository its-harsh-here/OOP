package lab1;
import java.util.Scanner;

public class ANS_G
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year: ");
		int y = in.nextInt();
		boolean f = false;
		if (y % 4 == 0 && (y % 400 == 0 || y % 100 != 0))
			f = true;
		if (f)
			System.out.println(y + " is a leap year!");
		else
			System.out.println(y + " is a common year!");	
	}
}
