/*
Name: Jacob Calkins
CS-2133-001
*/

public class Euler_10{
	public static void main(String[] args){
		long total = 0;
		for(int i = 2; i<2000000; i++){
			if(isPrime(i)){
				total+=i;
			}
		}
		System.out.println(total);
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