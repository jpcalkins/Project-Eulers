/*
Name: Jacob Calkins
CS-2133-001
*/

import java.util.*;

public class Euler_3 {
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
  
  public static void main(String args[]) {
    long bigNumber = Long.parseLong("600851475143");
    int upper = 0;
    while (bigNumber != 1) {
      int i = 2;
      while (i <= bigNumber) {
        if (isPrime(i) && bigNumber % i == 0){
          if (i > upper){
            upper = i;
          }
          bigNumber /= i;
          break;
        }
      i++;
      }
    }
    System.out.println(upper);
  }
}