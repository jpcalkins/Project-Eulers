/* Name: Jacob Calkins
CS-2133-001
Project Euler Problem #2*/
import java.util.*;

public class FibEu{
	public static void main (String args[]){
		//ArrayList to hold all fibonacci numbers
		ArrayList<Integer> fibs = new ArrayList<Integer>();
		fibs.add(1);
		fibs.add(1);
		//temp variable to hold the numbers in the sequence
		int nums=0;
		int i = 1;
		//running total of added even numbers
		int total = 0;

		while (nums < 4000000){
			i++;
			nums = (fibs.get(i-1)) + (fibs.get(i-2));
			fibs.add(nums);
			
			if (nums%2==0){ total = total + nums;
			}
		}
		System.out.println(total);
	}
}