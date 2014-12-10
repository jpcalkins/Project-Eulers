/*
Name: Jacob Calkins
CS-2133-001
*/

import java.math.*;
import java.util.*;

public class Euler_16{
	public static void main(String[] args){
		BigInteger magicNumber = new BigInteger("2");
		int sum = 0;
		magicNumber = magicNumber.pow(1000);
		String answer = magicNumber.toString();
		for(int i = 0; i<answer.length(); i++){
			sum += Character.getNumericValue(answer.charAt(i));
		}
		System.out.println(sum);
	}
}