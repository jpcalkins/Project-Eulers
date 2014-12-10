/*
Name: Jacob Calkins
CS-2133-001
*/

import java.math.*;
import java.util.*;

public class Euler_25{
	public static void main (String[] args){
		ArrayList<BigInteger> fibs = new ArrayList<BigInteger>();
		fibs.add(new BigInteger("1"));
		fibs.add(new BigInteger("1"));
		//nums is current iteration of Fib sequence
		BigInteger nums = new BigInteger("2");
		BigInteger oneBack = new BigInteger("1");
		BigInteger twoBack = new BigInteger("1");
		int i = 1;

		while (true){
			i++;
			oneBack = fibs.get(i-1);
			twoBack = fibs.get(i-2);
			nums = oneBack.add(twoBack);
			fibs.add(nums);
			//I did this because it was the easiest way to check for digits in Big Integer.
			String lengthFinder = nums.toString();
			if (lengthFinder.length() == 1000){
				//Plus one to account that array lists start at index 0
				System.out.println(i+1);
				break;
			}
		}
	}
}