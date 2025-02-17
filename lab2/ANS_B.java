package lab2;
import java.util.Scanner;

public class ANS_B 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter 9 digit Registration number: ");
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		System.out.println("Year of joining: " + a / 10000000);	
	}
}
