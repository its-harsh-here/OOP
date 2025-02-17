package lab1;
import java.util.Scanner; 

public class ANS_A 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		int h, r;
		double s;
		System.out.print("Enter Number of hours worked by employee: ");		
		h = in.nextInt();
		System.out.print("Enter Hourly Rate: ");		
		r = in.nextInt();
		if(h > 40)
			s = r * 40.0 + 1.5 * r * (h - 40);
		else
			s = r * h;
		System.out.println("Salary of the employee: " + s);
	}
}
