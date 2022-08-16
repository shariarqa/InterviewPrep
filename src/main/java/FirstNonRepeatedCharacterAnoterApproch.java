import java.util.HashMap;

public class FirstNonRepeatedCharacterAnoterApproch {


    public static void getFirstNonRepeatedValue(String inputStr){
        HashMap<Character, Integer> map = new HashMap<>();
        char arr[] = inputStr.toCharArray();
        for(char c : arr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        for(char c: map.keySet()){
            if(map.get(c)==1){
                System.out.println(c);
                break;
            }
        }

        System.out.println(map);


    }

    public static void main(String[] args) {
        getFirstNonRepeatedValue("the world is not enought");
    }
}
