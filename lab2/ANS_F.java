package lab2;
import java.util.Scanner;

public class ANS_F {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter daily electricity consumption for a week: ");
		int a[] = new int[7], c = 0;
		for(int i = 0; i < 7; i++)
		{
			a[i] = in.nextInt();
			c += a[i];
		}
		int n = (c - 1) / 100;
		switch (n)
		{
			case 0:
				c *= 7;
				break;
			case 1:
				c *= 8;
			default:
				c *= 10;
		}
		System.out.println("Total Electricity Bill: " + c);
	}
}
