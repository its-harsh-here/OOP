package lab2;
import java.util.Scanner;

public class ANS_H 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		System.out.println("Table of " + n + "is:");
		for(int i = 1; i <= 20; i++)
			System.out.println(n + " x " + i + " = " + n * i);
	}
}
