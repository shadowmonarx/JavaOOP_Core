package LeetCodeSol;
import  java.util.*;
public class ransomNote383 implements LeetCodeSolution{
    public boolean canConstruct(String ransomNote, String magazine) {
        System.out.println("RansomNote is : "+ ransomNote+ " And magazine is : " + magazine);
        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c , map1.get(c) + 1);
            }
            else{
                map1.put(c,1);
            }
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char d = ransomNote.charAt(i);
            if(map2.containsKey(d)){
                map2.put(d , map2.get(d) + 1);
            }
            else{
                map2.put(d,1);
            }
        }
        for(Map.Entry<Character , Integer> entry : map2.entrySet()){
            char p = entry.getKey();
            int o = entry.getValue();
            if (map1.containsKey(p)) {
                if(map1.get(p) < o){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }


    @Override
    public void run() {

        System.out.println(canConstruct("asd","asdfsergijasdfasdf"));
        System.out.println(canConstruct("knsdfkjnvkjn","asdfsergijasdfasdf"));
    }
}
