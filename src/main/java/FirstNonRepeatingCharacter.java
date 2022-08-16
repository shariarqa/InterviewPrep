public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        //String inputStr = "aabccdeef";
        String inputStr ="teeter";

        for(char i :inputStr.toCharArray()){
            if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: "+i);
                break;
            }
        }


        //System.out.println(count);



    }


}
