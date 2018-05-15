package Working_String;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* in regex  we have 1 - Repetition 2- Concatenation 3- Alternation
* First Repetition : + = sign math one or more ,* = means 0 or more ("it*") it matches i or zero t's or more t's
* Second Concatenation : we can combine the first and the second ("word+")
* Third Alternation : ("it|st") = it's either matches it or st , [] mean match "anything in the  set" just single characheter
* [-] match any value between them
* ^  = exculdes ("[^a-z123 ]") */
public class regex {
    public static void main(String[] args) {
        String hello = "adasdasdasdas";
        String [] x = hello.split("[a-z]");
        System.out.println(x[0]);
    }

}
