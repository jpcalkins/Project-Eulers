/*
Name: Jacob Calkins
CS-2133-001
*/

public class Euler_21{
	public static void main(String[] args){
		int sum = 0;
		for (int i = 1; i < 10000; i++){
			if (amicableTester(i)){
				sum += i;	
			}
		}
		System.out.println(sum);
	}
	public static boolean amicableTester(int x) {
		int sum = divisorSum(x);
		if(sum != x && divisorSum(sum) == x){
			return true;
		} else{
			return false;
		}
	}
	public static int divisorSum(int x) {
		int sum = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0){
				sum += i;
			}
		}
 	return sum;
	}
}