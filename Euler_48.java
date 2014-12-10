/*
Name: Jacob Calkins
CS-2133-001
*/

import java.math.*;

public class Euler_48{
	public static void main(String[] args){
		BigInteger total = new BigInteger("0");
		for(int i=1; i<=1000; i++){
			BigInteger tempBase = new BigInteger(String.valueOf(i));
			tempBase = tempBase.pow(i);
			total = total.add(tempBase);
		}
		String totalString = total.toString();
		System.out.println(totalString.substring(totalString.length()-10, totalString.length()));
	}
}