// Program: Lab8.java
// Author: Jared Suda
// Last Modified: March 17, 2021
// Desc.: RNG X's
import java.util.Random;

public class Lab8 {
   public static void main(String[] args) {
      Random rand = new Random();
      for(int i = 0; i < rand.nextInt(9) + 2; i++) {
         for(int x = 0; x < rand.nextInt(16) + 5; x++) {
            System.out.print("x");
         }
         System.out.println();
      }
   }
}
