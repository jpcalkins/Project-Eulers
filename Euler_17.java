/*
Name: Jacob Calkins
CS-2133-001
*/

public class Euler_17{
	public static String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
 	public static String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	public static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	public static String hundred = "hundred";
	public static String thousand = "onethousand";
	
	public static void main(String[] args){
		String finalAnswer = "";
		for(int i=1; i<=1000; i++){
			finalAnswer += convertToWords(i);
		}
		finalAnswer += thousand;
		System.out.println(finalAnswer.length());
	}
	
	public static String convertToWords(int x){
		String output = "";
		if(x < 10){
			return ones[x];
		} else if(x < 20 && x >= 10){
			return teens[x-10];
		} else if(x < 100 && x >= 20){
			output += tens[x/10];
			output += ones[x%10];
		} else if(x < 1000 && x >= 100){
			output += ones[x/100];
			output += hundred;
			if(x%100 <= 99 && x%100 > 19){
				output += "and";
				output += tens[(x%100)/10];
				output += ones[x%10];
			} else if(x%100 < 20 && x%100 >= 10){
				output += "and";
				output += teens[x%10];
			} else if(x%100 < 10 && x%100 > 0){
				output += "and";
				output += ones[x%10];
			}
		}
		return output;
	}
}