import java.util.*;
import java.io.*;

public class countCoins {
  public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(new File("countCoins.txt"));
      countCoins(console);
  }

  public static void countCoins(Scanner console) {
    double total = 0;
    while (console.hasNext()) {
        int amount = console.nextInt();
        String coinType = console.next().toLowerCase();

        if (coinType.equals("pennies")) {
          total += (amount * .01);
        } else if (coinType.equals("nickels")) {
          total += (amount * .05);
        } else if (coinType.equals("dimes")) {
          total += (amount * .10);
        } else if (coinType.equals("quarters")) {
          total += (amount * .25);
        }
    }
    System.out.printf("Total money: $%.2f\n", total);
  }
}
