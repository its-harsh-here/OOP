package lab3;
import java.util.Scanner;

class STUDENT
{
	Scanner in = new Scanner(System.in);
	String sname;
	int marks_array[] = new int[5];
	void assign()
	{
		System.out.println("Enter Student Name and Marks of 5 subjects: ");
		sname = in.next();
		for(int i = 0; i < 5; i++)
			marks_array[i] = in.nextInt();
	}
	void display()
	{
		System.out.println("Student Name: " + sname + "\nMarks of 5 subjects: ");
		for(int i = 0; i < 5; i++)
			System.out.print(marks_array[i] + " ");
		System.out.println();
	}
	void compute()
	{
		int total = 0;
		for(int i = 0; i < 5; i++)
			total += marks_array[i];
		double avg = total / 5.0;
		System.out.println("Total Marks: " + total + "\nAverage Marks: " + avg);
	}
}

public class ANS_A 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		STUDENT A = new STUDENT();
		A.assign();
		A.display();
		A.compute();
	}
}
