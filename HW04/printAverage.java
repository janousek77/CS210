import java.util.*;
public class printAverage {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Type a number: ");
    printAverage(console);
  }

  public static void printAverage(Scanner console) {
    double scores = 0;
    double total = 0;
    double avg = 0;
    int count = 0;

    while (scores >= 0) {
      scores = console.nextInt();
      total += scores;
      count++;
    }
    avg = (total - scores)/(count-1);
    if (total >= 0) {
      System.out.println("Average was " + avg);
    }
  }
}
