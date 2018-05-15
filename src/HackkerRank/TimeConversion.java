package HackkerRank;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }
    public static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        char l [];
        l = s.toCharArray();
        String j = (String)(l[0] +""+ l[1]);
        System.out.println();

        for (int i = 0 ; i < s.length() ; i++){
             if (l[8] == 'A' && Integer.parseInt(j) >= 12){
                String [] w = s.split(":");
                Integer x = Integer.parseInt(w[0]);
                char [] p = w[2].toCharArray();
                Integer k = x-12;
                String h = p[0] +""+ p[1];
                String z = k.toString()+"0" + ":" + w[1] +":" + h;
                return z;
            }
            else if (l[8] == 'A'){
                String [] w = s.split(":");
                Integer x = Integer.parseInt(w[0]);
                char [] p = w[2].toCharArray();
                String h = p[0] +""+ p[1];
                String z = "0"+x.toString() + ":" + w[1] +":" + h;
                return z;
            }
             else if (l[8]=='P' &&Integer.parseInt(j) ==12 ){
                 String [] w = s.split(":");
                 int x = Integer.parseInt(w[0]);
                 char [] p = w[2].toCharArray();
                 String h = p[0] +""+ p[1];
                 Integer y = x ;
                 String z = y.toString() + ":" + w[1] +":" + h;
                 return z;
             }
            else if (l[8]=='P' ){
                String [] w = s.split(":");
                int x = Integer.parseInt(w[0]);
                char [] p = w[2].toCharArray();
                String h = p[0] +""+ p[1];
                Integer y = x +12;
                String z = y.toString() + ":" + w[1] +":" + h;
                return z;
            }
        }
        return null;
    }
}
