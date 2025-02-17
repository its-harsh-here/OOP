package lab3;
import java.util.Scanner;

class EMPLOYEE
{
	Scanner in = new Scanner(System.in);
	int n = 100;
	String Ename[] = new String[n];
	int Eid[] = new int [n];
	double Basic[] = new double[n], DA[] = new double[n], Gross_Sal[] = new double[n], Net_Sal[] = new double[n];
	void read()
	{
		System.out.println("Enter Employee Data: ");
		for(int i = 0; i < n; i++)
		{
			Ename[i] = in.next();
			Eid[i] = in.nextInt();
			Basic[i] = in.nextDouble();
		}
	}
	void display()
	{	
		for(int i = 0; i < n; i++)
		{
			System.out.println("Employee " + (i + 1) + " Data: ");
			System.out.println("Name: " + Ename[i] + "\nId: " + Eid[i] + "\nBasic: " + Basic[i]);
		}
	}
	void compute_net_sal()
	{
		for(int i = 0; i < n; i++)
		{
			DA[i] =  0.52 * Basic[i];
			Gross_Sal[i] = Basic[i] + DA[i];
			Net_Sal[i] = 0.7 * Gross_Sal[i];
			System.out.println("Net Salary of " + Ename[i] + " is: " + Net_Sal[i]);
		}
	}
}

public class ANS_B
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		EMPLOYEE Rec = new EMPLOYEE();
		System.out.print("Enter Number of Employees: ");
		Rec.n = in.nextInt();
		Rec.read();
		Rec.display();
		Rec.compute_net_sal();
 	}
}