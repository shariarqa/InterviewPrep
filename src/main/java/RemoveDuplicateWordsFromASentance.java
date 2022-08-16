import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Stream;

public class RemoveDuplicateWordsFromASentance {

    public static void main(String[] args) {
        String sentence = "My world world is is not not quite enough", result ="";


        String allWords[] = sentence.split(" ");
        Stream str = Arrays.stream(allWords);
        //str.forEach(e-> System.out.print(e));

        LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(allWords));

        for(String word: set){
            result = result + word + " ";
        }
        System.out.println(result);


    }
}
