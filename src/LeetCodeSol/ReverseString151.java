package LeetCodeSol;

public class ReverseString151 implements LeetCodeSolution {
    public String reverseString(String a){
        String[] b = a.trim().split("\\s+");
        StringBuilder test = new StringBuilder();
        int j = b.length - 1;
        for (int i = j; i >= 0 ; i--){
            test.append(b[i]);
            if(i != 0){
                test.append(" ");
            }
        }
        return test.toString();
    }


    @Override
    public void run() {
        System.out.println("The String is : t a c o c a t m");
        System.out.println(reverseString("t a c o c a t m"));
        System.out.println("The String is : lala land is a land");
        System.out.println((reverseString("lala land is a land")));
    }
}
