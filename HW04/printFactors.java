import java.util.*;

public class printFactors {
  public static void main(String[] args) {
    System.out.println("Type in your number");
    Scanner console = new Scanner(System.in);
    int factor = console.nextInt();
    printFactors(factor);
  }

  public static void printFactors(int factor) {
     for (int i = 1; i <= factor; i++ ) {
       if (factor % i == 0) {
         System.out.print(i);
         if (i != factor) {
           System.out.print(" and ");
         }
       }
     }
  }
}
