import java.util.*;
import java.io.*;

public class stripHtmlTags {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(new File("stripHtmlTags.txt"));
    stripHtmlTags(console);
  }

  public static void stripHtmlTags(Scanner console) {
    while (console.hasNextLine()) {
      String line = console.nextLine();
      boolean goodToPrint = true;
      for (int i=0; i<line.length(); i++) {
        if(line.charAt(i) == '<'){
          goodToPrint = false;
        } else if (line.charAt(i) == '>') {
          goodToPrint = true;
        } else if (goodToPrint) {
          System.out.print(line.charAt(i));
        }
      }
      System.out.println();
    }
  }
}
