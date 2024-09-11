package Main;
import LeetCodeSol.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<LeetCodeSolution> solutions = new ArrayList<>();

        solutions.add(new FindWordsThatCanBeFormedByChar1160());
        solutions.add(new ReverseString151());
        solutions.add(new IndexOfFirstOccuranceInAString28());
        solutions.add(new LengthOfLastWord58());
        solutions.add(new ransomNote383());


        for (LeetCodeSolution solution : solutions) {
            System.out.println("Running test cases for: " + solution.getClass().getSimpleName());
            solution.run();
            System.out.println("----------------------------------------------------------------------------------------------");
        }
    }
}