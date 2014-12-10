/*
Name: Jacob Calkins
CS-2133-001
*/

import java.util.*;

public class Euler_4{
	public static void main(String[] args){
		int largestPalindrome = 0;
		for(int i = 999; i >= 100; i--){
			for(int j = 999; j >= 100; j--){
				int currentProduct = i*j;
				if(isPalindrome(currentProduct) == true){
					if(currentProduct > largestPalindrome){
						largestPalindrome = currentProduct;
					}
				}
			}
		}
		System.out.println(largestPalindrome);
	}
	public static boolean isPalindrome(int product){
		String forwardInt = String.valueOf(product);
		String backwardInt = new StringBuilder(forwardInt).reverse().toString();
		if(forwardInt.equals(backwardInt)){
			//System.out.println(forwardInt);
			return true;
		}
		return false;
	}
}