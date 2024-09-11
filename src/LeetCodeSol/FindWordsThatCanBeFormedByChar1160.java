package LeetCodeSol;
import java.util.Arrays;
import java.util.HashMap;

public class FindWordsThatCanBeFormedByChar1160 implements LeetCodeSolution {
    public int countCharacters(String[] words, String chars) {
        int length = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i < chars.length(); i++){
            char c = chars.charAt(i);
            map.put(c , map.getOrDefault(c , 0) + 1);
        }
        for(String word : words){
            HashMap<Character , Integer> map2 = new HashMap<>();
            boolean sets = true;
            for(int j = 0; j < word.length(); j++){
                char d = word.charAt(j);
                map2.put(d , map2.getOrDefault(d , 0) + 1);
            }
            for(char f : map2.keySet()){
                if(map.getOrDefault(f , 0) < map2.get(f)){
                    sets = false;
                    break;
                }
            }
            if(sets){
                length += word.length();
            }
        }
        return length;
    }



    @Override
    public void run() {
        String[] word = {"hello","not","rohittata"};
        String charc = "welldonehoneyro";
        System.out.println("Words are : "+ Arrays.toString(word) + " and characters are : " + charc);
        System.out.println(countCharacters(word , charc));
    }
}
