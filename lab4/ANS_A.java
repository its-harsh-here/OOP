package lab4;
import java.util.Scanner;

class STUDENT
{
	Scanner in = new Scanner(System.in);
	String sname;
	int marks_array[] = new int[5];
	STUDENT()
	{
		sname = "Harsh";
		int m[] = {98, 97, 88, 89, 100};
		marks_array = m;
	}
	STUDENT(String n, int a[])
	{
		this.sname = n;
		this.marks_array = a.clone();
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
		int m[] = {88, 98, 68, 95, 77};
		STUDENT A = new STUDENT("Kush", m);
		A.display();
		A.compute();
		STUDENT B = new STUDENT();
		B.display();
		B.compute();
	}
}
