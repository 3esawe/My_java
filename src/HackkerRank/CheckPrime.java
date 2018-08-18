public class CheckPrime{


    public static int gcd(int a , int b){
            if (a == 0){
              return b;
            }
            else {
              return gcd(a%b , a);
            }
      }

      public static Lists <Integer> checkprime (int a, int b){
          List <Integer> intlist = new ArrayList<Integer>();
          for (int i = a; i <= b ; i++){
              if (gcd(a,b) == 1){
                 intlist.add(i);
              }
          }
          return intlist;
      }

      public static void main(String[] args) {
            List <Integer> mylist = checkprime(1,7);
            Iterator myit = mylist.Iterator;
            for (int c  : mylist ) {
                System.out.println(c);
            }
      }
}
