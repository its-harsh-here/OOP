package lab2;
import java.util.Scanner;

public class ANS_K
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements in the array: ");
		int n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elemts of the array: ");
		for(int i = 0; i < n; i++)
			a[i] = in.nextInt();
		System.out.print("Enter number to be searched: ");
		int s = in.nextInt(), f = 0;
		for(int i = 0; i < n; i++)
		{
			if (a[i] == s && f == 0)
			{
				System.out.print("The value is found at locations: a[" + i + "] ");
				f++;
			}
			else if (a[i] == s)
				System.out.print(", a[" + i + "] ");
		}
		if (f == 0)
			System.out.println("Number not found!");
	}
}
