package Working_String;

public class main {
    public static void main(String[] args) {

        System.out.println(       countSyllables("If you want to use this code, you should copy") );
        System.out.println(       countSyllables1 ("If you want to use this code, you should copy"));

    }

    /*this methode doesn't work beacause we are dealing with a copy of String which is char[] a = word.toCharArray();
     */
    public static String replac(String word, char gone, char newChar) {
        char[] a = word.toCharArray();

        for (char c : a) {
            if (c == gone) {
                c = newChar;
            }

        }
        return word;

    }
        /*This neither will not work
         * c doesnt have connection with a
         * c keeps  updating each loop iteration
         * */
        public static String replace (String word,char gone, char newChar){
            char[] a = word.toCharArray();

            for (char c : a) {
                if (c == gone) {
                    c = newChar;
                }

            }
            return new String(a);

        }
    public static String replace1(String word,
                                 char gone, char here)
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
    protected static int countSyllables(String word)
    {
        //System.out.print("Counting syllables in " + word + "...");
        int numSyllables = 0;
        boolean newSyllable = true;
        String vowels = "aeiouy";
        char[] cArray = word.toCharArray();
        for (int i = 0; i < cArray.length; i++)
        {
            if (i == cArray.length-1 && Character.toLowerCase(cArray[i]) == 'e'
                    && newSyllable && numSyllables > 0) {
                numSyllables--;
            }
            if (newSyllable && vowels.indexOf(Character.toLowerCase(cArray[i])) >= 0) {
                newSyllable = false;
                numSyllables++;
            }
            else if (vowels.indexOf(Character.toLowerCase(cArray[i])) < 0) {
                newSyllable = true;
            }
        }
        //System.out.println( "found " + numSyllables);
        return numSyllables;
    }
    protected static int countSyllables1(String word)
    {
        // TODO: Implement this method so that you can call it from the
        // getNumSyllables method in BasicDocument (module 2) and
        // EfficientDocument (module 3).
        int z = 0;
        char[]  x = word.toCharArray();
        String non = "xqwrtyplkjhgfdszxcvbnm";
        char [] nov= non.toCharArray();

//		String vowels = "aioue";
        for (char c : x  ){

            if (c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'e' ){
                z ++;

            }

        }



        System.out.println("found: " + z);
        return z;
    }

    }

