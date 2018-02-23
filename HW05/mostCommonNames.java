import java.util.*;
import java.io.*;

public class mostCommonNames {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(new File("mostCommonNames.txt"));
    mostCommonNames(console);
  }

  public static void mostCommonNames(Scanner console) {
    while (console.hasNextLine()) {
      Scanner line = new Scanner(console.nextLine());
      String most = line.next();
      String prev = most;
      int mostNum = 1;
      int prevNum = 1;
        while (line.hasNext()) {
          String curr = line.next();
          if (curr.equals(prev)) {
            prevNum++;
            if (prevNum > mostNum) {
            most = prev;
            mostNum = prevNum;
          }
        } else {
          prev = curr;
          prevNum = 1;
        }
      }
      System.out.println("Most common name: " + most);
    }
  }
}
