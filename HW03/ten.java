import java.util.*;

public class ten {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Type in your name");
    String name = console.next();
    System.out.println("Type in the how many grades you have. Then the grades themselves.");
    System.out.println(name + " " +  printGPA(console));
  }

  public static double printGPA(Scanner console) {
    int scores = console.nextInt();
    int count = 0;
    double total = 0;
    double grade = 0;

    while (scores > 0) {
      grade = console.nextInt();
      total += grade;
      count++;
      scores--;
    }
    return total/count;
  }
}
