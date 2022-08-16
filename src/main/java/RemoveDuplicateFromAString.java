import java.util.HashSet;

public class RemoveDuplicateFromAString {

    // Using Loops
    // Using Sorting Algorithm
    // Usingh Hashing
    // Using the Indexof() method

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char[] arr = s.toCharArray();
        //int n = arr.length;

        //HasSet implements set interface and never allow duplicate and its comparately slower then the HashMAP
        HashSet<Character> set = new HashSet<Character>();

        for(char x : arr)
            set.add(x);



            for(char y: set)
                System.out.print(y);
            }




}
