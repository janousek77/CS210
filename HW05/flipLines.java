import java.util.*;
import java.io.*;

public class flipLines {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(new File("flipLines.txt"));
    flipLines(console);
  }

  public static void flipLines(Scanner console) {
    while(console.hasNextLine()){
      String temp = console.nextLine();

      if (!console.hasNextLine()) {
        System.out.println(temp);
      } else {
        System.out.println(console.nextLine());
        System.out.println(temp);
      }
    }
  }
}
