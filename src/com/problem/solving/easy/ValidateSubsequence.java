package com.problem.solving.easy;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        boolean result = isValidSubsequence(array, sequence);
        System.out.println("Is Valid : " + result);
    }

    /*
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seq = 0;
        for (Integer element : array) {
            if (sequence.get(seq) == element) {
                seq++;
                if (sequence.size() == seq) return true;
            }
        }
        return false;
    }
}
