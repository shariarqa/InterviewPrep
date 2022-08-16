import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Stream;

public class LongestValidPalindrome {

    public static void main(String[] args) {

        String sentence = "aa baa";
        boolean result = isPali(sentence);
        System.out.println(result);


    }

    public static boolean isPali(String s){
        //String sentence = "A man, a plan, a canal: Panama", result ="";
        String reverse = null;
        boolean result = false;
        if (s=="" || s == null){
            result= false;
        }else{
            s = s.replaceAll("[^A-Za-z0-9]","");
            s = s.toLowerCase();
            System.out.println(s);

            StringBuilder sb = new StringBuilder(s);
            reverse = sb.reverse().toString();


        }

        if(s.equals(reverse)){
            result = true;

        }else {
            result =  false;
            //System.out.println(s);
            // System.out.println(reverse);
            // System.out.println("Not");
        }

        return result;
    }
}
