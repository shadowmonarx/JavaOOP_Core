package LeetCodeSol;

public class LengthOfLastWord58 implements LeetCodeSolution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");
        int n = word.length;
        String last = word[n-1];
        return last.length();
    }



    @Override
    public void run() {
        System.out.println("String is : Hello My Name Is Rohit");
        System.out.println(lengthOfLastWord("Hello My Name Is Rohit"));
    }
}
