/*
Name: Jacob Calkins
CS-2133-001
Project Euler Problem #6
*/

public class SumSquare{
	public static void main (String[] args){
		int sumSquares = 0;
		int total = 0;
		for(int i = 1; i<=100; i++){
			sumSquares = sumSquares+(int)Math.pow(i, 2);
			total = total + i;
		}
		total = (int)Math.pow(total, 2);
		System.out.println("sumSquares: " + sumSquares);
		System.out.println("Square Sum: " + total);
		int answer = total - sumSquares;
		System.out.println("Total: "+answer);
	}
}