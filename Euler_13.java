/*
Name: Jacob Calkins
CS-2133-001
Project Euler Problem #13
*/
import java.math.*;
import java.util.*;
import java.io.*;

public class LargeSum{
	public static void main (String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner (new File("Numbers.txt"));
		BigInteger magicNumber = new BigInteger("0");
		while(scan.hasNextLine()){
			BigInteger adder = new BigInteger(scan.nextLine());
			magicNumber = magicNumber.add(adder);
		}
		String answer = magicNumber.toString();
		for(int i=0; i<10; i++){
			System.out.print(answer.charAt(i));
		}
		System.out.println();
	}
}