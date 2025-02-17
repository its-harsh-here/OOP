package lab2;
import java.util.Scanner;

public class ANS_M
{
	static int fact(int n)
	{
		int c = 1;
		for(int i = 2; i <= n; i++)
			c *= i;
		return c;
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number x: ");
		int x = in.nextInt();
		boolean f = true;
		double sin = 0;
		for(int i = 1; i <= 10; i+= 2)
		{
			if (f)
				sin += Math.pow(x, i) / fact(i);
			else
				sin -= Math.pow(x, i) / fact(i);
			f ^= true;
		}
		int s = 0; 
		for(int i = 1; i <= x; i++)
			s += (1 / i ) * i;
		System.out.println("sin(" + x + ") = " + sin + "\nSum = " + s);
	}
}
