package lab2;
import java.util.Scanner;

public class ANS_L
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Case 1: \n");
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				for(int k = 1; k <= 4; k++)
				{
					for(int l = 1; l <= 4; l++)
						System.out.println(i * 1000 + j * 100 + k * 10 + l);
				}
			}
		}
		System.out.println("\n\n\nCase 2: \n");
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				if (i == j)
					continue;
				for(int k = 1; k <= 4; k++)
				{
					if (k == i || k == j)
						continue;
					for(int l = 1; l <= 4; l++)
					{
						if (l == i || l == j || l == k)
							continue;
						System.out.println(i * 1000 + j * 100 + k * 10 + l);
					}
				}
			}
		}
	}
}	