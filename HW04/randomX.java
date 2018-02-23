import java.util.*;

public class randomX {
  public static void main(String[] args) {
    randomX();
  }

  public static void randomX() {
    Random r = new Random();
    int rand = 0;
    while(rand < 16){
      rand = r.nextInt(16) + 5;
      for(int i = 0; i < rand; i++){
        System.out.print('x');
      }
      System.out.println();
    }
  }
}
