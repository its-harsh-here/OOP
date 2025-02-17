package lab1;
import java.util.Scanner;

public class ANS_E 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number of Products: ");
		int n = in.nextInt();
		String name[] = new String[n];
		int p[] = new int[n], q[] = new int[n];
		System.out.println("Enter name price and quantity of product:");
		for(int i = 0; i < n; i++)
		{
			name[i] = in.next();
			p[i] = in.nextInt();
			q[i] = in.nextInt();
		}
		int c = 0;
		System.out.print("Enter Number of Products Purchased: ");
		int x = in.nextInt(), q2;
		String t;
		for(int i = 0; i < x; i++)
		{
			t = in.next();
			q2 = in.nextInt();
			for(int j = 0; j < n; j++)
			{
				if(t.equals(name[j]))
				{
					System.out.println(t);
					c += q2 * p[j];
					break;
				}
			}
		}
		System.out.println("Total Bill: Rs "+ c);
	}	
}
