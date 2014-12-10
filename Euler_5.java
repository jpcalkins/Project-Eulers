/* 
Name: Jacob Calkins
CS-2133-001
Project Euler Problem #5
*/

public class Divisor
{
	public static void main(String[] args)
	{
		int number = 0;
		int count = 1;
		while(count<21)
		{
			count = 1;
			number= number+20;
			for(int i = 1; i<=20; i++)
			{
				if(number%i==0)
				{
					count++;
				}
			}
		}
		System.out.println(number);
	}
}