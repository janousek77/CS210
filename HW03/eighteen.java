import java.util.*;

public class eighteen {
  public static void main(String[] args) {
    System.out.println(wordCount("hello"));
    System.out.println(wordCount(" "));
    System.out.println(wordCount("how are you"));
    System.out.println(wordCount(" this string has wide open spaces "));
  }

  public static int wordCount(String n) {
    int count = 0;
    int num = 0;
    for (int i = 0;i < n.length(); i++ ) {
      if (n.charAt(i) != ' ') {
        count++;
      } else if (n.charAt(i) == ' ' && count > 0) {
        num++;
        count = 0;
      }
    }
    if (count > 0) {
      num++;
    }
    return num;
  }

}
