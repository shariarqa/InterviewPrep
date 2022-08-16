public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        int max=0;
        String maxSub="";





    }

    public static boolean isPlanindorme(String sub){
        sub = "aabaa";
        int left =0;
        int right = sub.length()-1;

        while(left<=right){
            if(sub.charAt(left)!=sub.charAt(right)){
                    return false;
            }
            return true;
        }




        return true;


    }


}
