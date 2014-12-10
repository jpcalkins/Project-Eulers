/*
Name: Jacob Calkins
CS-2133-001
*/

public class Euler_39{
  public static void main(String[] args) {
    int maxPerimeter = 0;
    int maxTriangles = 0;
    for (int i = 1; i <= 1000; i++) {
      int triangles = countSolutions(i);
      if (triangles > maxTriangles) {
        maxTriangles = triangles;
        maxPerimeter = i;
      }
    }
    System.out.println(maxPerimeter);
  }

  public static int countSolutions(int p) {
    int count = 0;
    for (int a = 1; a <= p; a++) {
      for (int b = a; b <= p; b++) {
        int temp = p - a - b;
        if (b <= temp && a * a + b * b == temp * temp){
          count++;
        }
      }
    }
    return count;
  }  
}