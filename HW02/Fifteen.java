public class Fifteen {
  public static void main(String[] args) {
    printDesign();
  }

  public static void printDesign() {
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("-");
      }
      for (int j = 1; j <= (11 - 2 * i); j++) {
        System.out.print(11 - 2 * i);
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("-");
      }
      System.out.println();
    }
  }
}
