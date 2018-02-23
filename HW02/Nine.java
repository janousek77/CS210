public class Nine {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {

      if (i == 1) {
        for (int j = 1; j < 11; j++) {
          System.out.print("_-^-");
        }

      } else if (i == 2) {
        for (int k = 1; k < 3; k++) {
          for (int j = 1; j < 11; j++) {
            System.out.print(j%10 + "" + j%10);
          }
        }

      } else {
        for (int j = 1; j < 11; j++) {
          System.out.print("----");
        }
      }
      System.out.println();
    }
  }
}
