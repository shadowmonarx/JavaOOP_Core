package LeetCodeSol;

public class IndexOfFirstOccuranceInAString28 implements LeetCodeSolution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    @Override
    public void run() {
        System.out.println("Haystack : happybutnotsad , Needle : sad");
        System.out.println(strStr("happybutnotsad","sad"));
    }
}
