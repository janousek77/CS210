import java.util.*;
import java.io.*;

public class stripComments {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(new File("stripComments.txt"));
    stripComments(console);
  }

  public static void stripComments(Scanner console) {
    boolean multi = true;
    while (console.hasNextLine()) {
      String line = console.nextLine();
      boolean single = true;
      for (int i =0; i<line.length(); i++) {
        if (line.charAt(i) == '/' && line.charAt(i+1) == '*') {
          multi = false;
        } else if (line.charAt(i) == '/' && line.charAt(i+1) == '/') {
          single = false;
        } else if (line.charAt(i) == '*' && line.charAt(i+1) == '/') {
          multi = true;
          i++;
        } else if (multi && single) {
          System.out.print(line.charAt(i));
        }
      }
      System.out.println();
    }
  }
}
