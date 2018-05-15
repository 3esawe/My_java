package Strings_for_loops;

public class Reaplace {

        public static void main(String[] args) {
            System.out.println(replace("a hello",'a', 'i'));
            System.out.println(replace1("a hallo",'a', 'i'));

        }
        public static String replace(String word,
                                     char gone, char here)
        {
            char[] cArray = word.toCharArray();
            for (char c : cArray)
            {
                if (c == gone)
                {
                    c = here;
                }

            }

            return new String(cArray);
        }
        public static String replace1(String word, char gone, char here)
        {
            char[] cArray = word.toCharArray();
            char[] cArrayMod = new char[cArray.length];
            int i = 0;
            for (char c : cArray) {
                if (c == gone)
                    cArrayMod[i] = here;
                else
                    cArrayMod[i] = c;
                i++;
            }
            return new String(cArrayMod);
        }


}
