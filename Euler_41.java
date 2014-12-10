/*
Name: Jacob Calkins
CS-2133-001
*/

public class Euler_41{
	public static void main(String[] args) {
	    for(long i=7654321L;i>1234566L;i-=2){
	        if(isUnique(i)){
	            if(isPrime(i)){
	                    System.out.println(i);
	                    break;
	            }
	        }
	    }
	}
	public static boolean isUnique(long input){
	    String str = String.valueOf(input);
	    for(int i = 0;i < str.length(); i++){
	        if(str.charAt(i)=='9'){
	        	return false;
	        }
	        if(str.charAt(i)=='8'){
	        	return false;
	        }
	        if(str.charAt(i)=='0'){
	        	return false;
	        }
	    }
	    for(int i = 0; i < str.length() - 1; i++){
	        for(int j=i;j<str.length()-1;j++){
	            if(str.charAt(i)==str.charAt(j+1)){
	            	return false;
	            }
	        }
	    }
	    return true;
	}
	public static boolean isPrime(long input) {
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