/*
Name: Jacob Calkins
CS-2133-001
*/

public class Euler_7{
	public static void main(String[] args){
		int currentNumber = 2;
		int primeIndex = 0;
		int primeNumber = 0;
		while(primeIndex < 10001){
			if(isPrime(currentNumber)){
				primeNumber = currentNumber;
				primeIndex++;
			}
			currentNumber++;
		}
		System.out.println(primeNumber);
	}
	public static boolean isPrime(int input) {
    	if (input == 2){
      		return true;
    	}
    	if (input % 2 == 0 || input == 1){ 
      		return false;
    	}
    	long limit = (long)Math.sqrt(input);
    	for (int i = 3; i <= limit; i += 2){
      		if (input % i == 0){
        		return false;
      		}
    	}       
    	return true;
  	}
}