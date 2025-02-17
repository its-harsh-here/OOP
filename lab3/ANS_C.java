package lab3;
import java.util.Scanner;
import java.util.Arrays;

class Mixer
{
	int arr[];
	void accept(int a[])
	{
		arr = new int[a.length];
		arr = a;
	}
	Mixer mix(Mixer A, int a[])
	{
		int t[] = new int[a.length + A.arr.length];
        System.arraycopy(a, 0, t, 0, a.length);
        System.arraycopy(A.arr, 0, t, a.length, A.arr.length);
        Arrays.sort(t);
        A.arr = new int[arr.length];
        A.arr = t;
		return A;
	}
	void display()
	{
		System.out.println("Elements of array: ");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}	
}

public class ANS_C
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Number of elements in array: ");
		int n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Elements:");
		for(int i = 0; i < n; i++)
			a[i] = in.nextInt();
		Arrays.sort(a);
		for(int i = 0; i < n - 1; i++)
		{
			if (a[i] == a[i + 1])
			{
				for(int j = i + 1; j < n - 1; j++)
					a[j] = a[j + 1];
				n--;
			}
		}
		int b[] = new int[n];
        System.arraycopy(a, 0, b, 0, n);
		Mixer M = new Mixer();
		M.accept(b);
		System.out.print("Number of elements in parameterized array: ");
		n = in.nextInt();
		b = new int[n];
		System.out.println("Enter Elements:");
		for(int i = 0; i < n; i++)
			b[i] = in.nextInt();
		M = M.mix(M, b);
		M.display();
	}
}