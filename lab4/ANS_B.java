package lab4;
import java.util.Scanner;

class EMPLOYEE
{
	Scanner in = new Scanner(System.in);
	int n = 100;
	String Ename[] = new String[n];
	int Eid[] = new int [n];
	double Basic[] = new double[n], DA[] = new double[n], Gross_Sal[] = new double[n], Net_Sal[] = new double[n];
	EMPLOYEE ()
	{
		n = 3;
		String n[] = {"Harsh", "Darsh", "Kush"};
		Ename = n.clone();
		int i[] = {1, 2, 3};
		Eid = i.clone();
		double b[] = {50000, 20000, 100000};
		Basic = b.clone();
	}
	EMPLOYEE (String n[], int id[], double b[], int t)
	{
		this.n = t;
		this.Ename = n.clone();
		this.Eid = id.clone();
		this.Basic = b.clone();
	}
	void display()
	{	
		for(int i = 0; i < n; i++)
			System.out.println("Employee " + (i + 1) + " Data: " + "\nName: " + Ename[i] + "\nId: " + Eid[i] + "\nBasic: " + Basic[i] + "\nNet Salary: " + Net_Sal[i]);
	}
	void compute_net_sal()
	{
		for(int i = 0; i < n; i++)
		{
			DA[i] =  0.52 * Basic[i];
			Gross_Sal[i] = Basic[i] + DA[i];
			Net_Sal[i] = 0.7 * Gross_Sal[i];
		}
	}
}

public class ANS_B
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		EMPLOYEE Rec1 = new EMPLOYEE();
		Rec1.compute_net_sal();
		Rec1.display();
		String n[] = {"Gautam", "Yash", "Satwik"};
		int i[] = {1, 2, 3};
		double b[] = {340000, 25000, 920000};
		EMPLOYEE Rec2 = new EMPLOYEE(n, i, b, 3);
		Rec2.compute_net_sal();
		Rec2.display();
 	}
}