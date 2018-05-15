public class MaxSum {
  public static void main(String[] args) {
      int [] rand = {1,2,3,4,5};
      int max = rand[0];
      int min = 0;
      for (int i = 1 ; i < rand.length ;i++ ) {
          for (int j = 1 ; j < rand.length-1;j++){

                  max += rand [i] + rand[j];


                  min = rand [i] + rand[j];

          }

        }
        System.out.println(max );
        System.out.println(min );

  }
}
