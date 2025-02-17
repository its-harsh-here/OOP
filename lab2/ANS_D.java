package lab2;
import java.util.Scanner;

public class ANS_D 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter order of matrix: ");
		int n = in.nextInt(), a[][] = new int[n][n], c = 0;
		System.out.print("Enter elements of the matrix: ");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
				a[i][j] = in.nextInt();
		}
		System.out.println("Non Diagonal elements: ");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if (i == j || i + j == n - 1)
					continue;
				System.out.print(a[i][j] + " ");
				c += a[i][j];
			}
		}
		System.out.println();
		System.out.println("Sum of non diagonal elements: " + c);
	}
}
