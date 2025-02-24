package lab4;
import java.util.Scanner;

class BANK_ACC
{
	String name, type;
	long num;
	double bal;
	static double roi;
	BANK_ACC() 
	{
		name = "Harsh";
		num = 5983;
		type = "Saving";
		bal = 102949;
		roi = 7;
	}
	BANK_ACC (String n, int i, String s, double b, double r) 
	{
		this.name = n;
		this.num = i;
		this.type = s;
		this.bal = b;
		roi = r;
	}
	void deposit(double d)
	{
		bal += d;
		System.out.println(d + " has been deposit!");
	}
	void withdraw(double w)
	{
		if (bal >= w)
		{
			bal -= w;
			System.out.println(w + " has been withdrawn!");
		}
		else
			System.out.println("Insufficient Balance!");
	}
	void details()
	{
		System.out.println("Account Details:\n" + "Name: " + name + "\nNo.: " + num + "\nType: " + type + "\nBal: " + bal);
	}
	void droi()
	{
		System.out.println("Rate of Interest: " + roi);
	}
}

public class ANS_C 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		BANK_ACC one = new BANK_ACC("Kush", 2983, "Current", 339449, 4);
		one.details();
		one.withdraw(1258);
		one.deposit(200);
		one.details();
		one.droi();
		BANK_ACC two = new BANK_ACC();
		two.details();
		two.withdraw(2200);
		two.deposit(110);
		two.details();
		two.droi();
		
	}
}
