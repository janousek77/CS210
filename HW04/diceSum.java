import java.util.*;

public class diceSum {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Type the desired dice sum");
    int sum = console.nextInt();
    if (sum < 2 || sum > 12) {
      System.out.println("Choose a number between 2 - 12");
    } else {
      diceSum(sum);
    }
  }

  public static void diceSum(int sum) {
    Random num = new Random();
    int one = 0;
    int two = 0;
    int total = 0;
    while (total != sum) {
      one = num.nextInt(6) + 1;
      two = num.nextInt(6) + 1;
      total = one + two;
      System.out.println(one + " and " + two + " = " + total);
    }
  }
}
