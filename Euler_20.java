/*
Name: Jacob Calkins
CS-2133-001
*/

import java.math.*;
import java.util.*;

public class Euler_20{
	public static void main (String[] args){
		BigInteger magicNumber = new BigInteger("1");
		for(int i = 100; i>= 1; i--){
			magicNumber = magicNumber.multiply(new BigInteger(String.valueOf(i)));
		}
		String answer = magicNumber.toString();
		int sum = 0;
		for(int i = 0; i<answer.length(); i++){
			sum += Character.getNumericValue(answer.charAt(i));
		}
		System.out.println(sum);
	}
}