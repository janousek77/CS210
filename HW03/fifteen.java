import java.util.*;

public class fifteen {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Type in your grade 0 - 100");
    System.out.println("Your course grade is " +  getGrade(console));
  }

  public static double getGrade(Scanner console) {
    int input = console.nextInt();
    double grade = 0;
    if (input < 0 || input > 100) {
      throw new IllegalArgumentException();
    } else if (input > 60 && input <= 62 ) {
      grade = 0.7;
    } else if (input >= 95  ) {
      grade = 4.0;
    } else if (input > 62  ) {
      grade = Math.round(((input - 62) * 0.1 + 0.7) * 10) / 10.0;
    } else {
      grade = 0.0;
    }
    return grade;
  }
}
