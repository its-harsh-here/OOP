package lab2;
import java.util.Scanner;

public class ANS_J
{
	static boolean prime(int n)
	{
		if (n < 2)
			return false;
		for(int i = 2; i <= n / 2; i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter range(n m): ");
		int n = in.nextInt(), m = in.nextInt();
		for(int i = n; i <= m; i++)
		{
			if(prime(i))
				System.out.print(i + " ");
		}
	}
}
