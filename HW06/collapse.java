/*
    Chris Janousek
	 CS210 Assignment HW05 chapter 7 #15
    2/7/2018
*/

import java.util.*;

public class collapse {
  public static void main(String[] args){
    collapse(new int[] {7, 2, 8, 9, 4, 13, 7, 1, 9, 10});
    System.out.println();
    collapse(new int[] {1, 2, 3, 4, 5});
    System.out.println();
    collapse(new int[] {100, -100});
    System.out.println();
    collapse(new int[] {1, 2, 3});
    System.out.println();
    collapse(new int[] {1});
    System.out.println();
    collapse(new int[] {});
    System.out.println();
  }

  public static int[] collapse(int[] list) {
      int[] collapsed = new int[(list.length + 1) / 2];
      int i = 0;

      for(int j = 0; j <= list.length - 2; j += 2) {
          collapsed[i] = list[j] + list[j+1];
          i++;
      }

      if(i != collapsed.length)
          collapsed[i] = list[list.length - 1];

      System.out.print(Arrays.toString(collapsed));

      return collapsed;
  }
}
