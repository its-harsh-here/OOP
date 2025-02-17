package lab1;
import java.util.Scanner;

public class ANS_H 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an int, double and a char:");
		int a = in.nextInt();
		double b = in.nextDouble();
		char c = in.next().charAt(0);
		byte ans1 = (byte) a;
		int ans2 = (int) c;
		byte ans3 = (byte) b;
		int ans4 = (int) b;
		System.out.println("int to byte: " + ans1);
		System.out.println("char to int: " + ans2);
		System.out.println("double to byte: " + ans3);
		System.out.println("double to int: " + ans4);
	}
}
