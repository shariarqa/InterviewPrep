public class LongestValidPalindromeOtherSolution {

    public static void main(String[] args) {
        String sentence = "A man, a plan, a canal: Panama";
        sentence = sentence.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        //System.out.println(sentence);
        String reverse = "";

       for(int j= sentence.length()-1 ; j>=0; j--){
           reverse += sentence.charAt(j);


       }
        if(sentence.equals(reverse)){
            System.out.println("pali");
        }else {
            System.out.println("notpali");
        }

    }
}
