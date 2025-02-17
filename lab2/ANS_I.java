package lab2;
import java.util.Scanner;

public class ANS_I
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter length of triangle: ");
		int n = in.nextInt();
		System.out.println("Using Nested for loop: ");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
				System.out.print(i + " ");
			System.out.println();
		}
		System.out.println("\nUsing for each loop: ");
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = i + 1;
		for(int i : a)
		{
			int b[] = new int[i];
			for(int j : b)
				System.out.print(i + " ");
			System.out.println();
		}
	}
}
