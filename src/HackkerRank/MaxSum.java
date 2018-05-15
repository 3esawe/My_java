package HackkerRank;

import java.util.ArrayList;

public class MaxSum {
  public static void main(String[] args) {
      int [] rand = {1,2,3,4,5};
      int max = 0;
      int min = 0;

      for (int i =  1; i < rand.length ;i++ ) {

            max+= rand[i];
            min += rand[i-1];
        }

      System.out.println(max);
      System.out.println(min);

  }

}
