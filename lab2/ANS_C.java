package lab2;
import java.util.Scanner;

public class ANS_C 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Date of birth (ddmmyyyy): ");
		int n = in.nextInt();
		System.out.print("Enter Years of service: ");
		int s = in.nextInt();
		int d = n / 1000000, m = (n % 1000000) / 10000, y = n % 10000;
		y += 60;
		if (m == 2 && y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))
			d = 29;
		else if (m == 2)
			d = 28;
		else if ((m > 8 && m % 2 == 1) || (m < 8 && m % 2 == 0))
			d = 30;
		else
			d = 31;
		System.out.println("Date of retirement : " + d + "-" + m + "-" + y);
	}
}
