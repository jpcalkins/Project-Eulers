/*
Name: Jacob Calkins
CS-2133-001
Project Euler Problem #8
*/
import java.math.*;
import java.util.*;
import java.io.*;

public class LargeProduct{
	public static void main (String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("NumList.txt"));
		String numbers = scan.nextLine();
		int count = 1;
		int winner = 1;
		int j = 5;
		for(int i=0; i<5; i++){
			count = count * Character.getNumericValue(numbers.charAt(i));
		}
		winner = count;
		while (j < numbers.length()){
			count = 1;
			for (int k = j-4; k <= j; k++) {
				count = count * Character.getNumericValue(numbers.charAt(k));
			}
			if(count > winner){
				winner = count;
			}
			System.out.println(count);
			j++;
		}
		System.out.println("Largest Product: " + winner);
	}
}