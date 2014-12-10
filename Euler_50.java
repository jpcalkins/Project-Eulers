/*
Name: Jacob Calkins
CS-2133-001
*/

import java.util.*;

public class Euler_50{
  public static void main(String[] args){
    boolean[] primeBools = new boolean[1000000];
    ArrayList<Integer> primes = new ArrayList<Integer>();

    for(int i = 2; i<1000000; i++){
      if(isPrime(i)){
        primes.add(i);
        primeBools[i] = true;
      }
    }
    long maxSum = 0;
    int maxRun = -1;

    for (int i = 0; i < primes.size(); i++){
      int sum = 0;
      for (int j = i; j < primes.size(); j++){
        sum += primes.get(j);
        if (sum > 1000000){
          break;
        }else if (j - i > maxRun && sum > maxSum && primeBools[sum]) {
          maxSum = sum;
          maxRun = j - i;
        }
      }
    }
    System.out.println(maxSum);
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