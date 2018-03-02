/*
    Chris Janousek
	 CS210 Assignment HW05 chapter 7 #18
    2/7/2018
*/

import java.util.*;
import java.io.*;

public class wordLengths {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(new File("wordLengths.txt"));
    wordLengths(console);
  }

  public static void wordLengths(Scanner console){
    int[] counts = new int[80];

    while(console.hasNext()) {
        String str = console.next();
        counts[str.length() - 1]++;
    }

    for(int i = 0; i < counts.length; i++) {
       if(counts[i] > 0) {
          System.out.print((i+1) + ": " + counts[i] + "\t");
          for(int j = 0; j < counts[i]; j++)
              System.out.print("*");
          System.out.println();
      }
    }
  }
}
