package lab1;
import java.util.Scanner;

public class ANS_D 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements in the array: ");
		int n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements of the array: ");
		for(int i = 0; i < n; i++)
			a[i] = in.nextInt();
		System.out.print("Enter 1 for left rotate and 0 for right rotate: ");
		int t = in.nextInt();
		System.out.print("Enter number of steps: ");
		int s = in.nextInt(), b;
		while(t == 1 && s-- > 0)
		{
			b = a[0];
			for(int i = 0; i < n - 1; i++)
				a[i] = a[i + 1];
			a[n - 1] = b;
		}
		while(t == 0 && s-- > 0)
		{
			b = a[n - 1];
			for(int i = n - 1; i > 0; i--)
				a[i] = a[i - 1];
			a[0] = b;
		}
		System.out.println("Rotated Array: ");
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}
