package lab1;
import java.util.Scanner; 

public class ANS_B
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		int a, b, x;
		System.out.print("Enter First Number: ");		
		a = in.nextInt();
		System.out.print("Enter Second Number: ");		
		b = in.nextInt();
		while(b != 0)
		{
			x = a ^ b;
			b = (a & b) << 1;
			a = x;
		}
		if (a % 2 == 0)
			System.out.println("Sum of number is Even!");
		else
			System.out.println("Sum of number is Odd");
	}
}