package com.problem.solving.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeNumberSum {

    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
        List<Integer[]> result = threeNumberSum(array, targetSum);
        for (Integer[] triplet : result) {
            System.out.println(triplet[0] + " " + triplet[1] + " " + triplet[2]);
        }
    }

    /*
     * Time Complexity : O(n ^ 3) || Space Complexity : O(k)
     *
     * Note: The numbers in triplet is sorted, but the triplet itself is not ordered in ascending order.
     */
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    int sum = array[i] + array[j] + array[k];
                    if (sum == targetSum) {
                        Integer[] triplet = new Integer[3];
                        triplet[2] = Math.max(array[i], Math.max(array[j], array[k]));
                        triplet[0] = Math.min(array[i], Math.min(array[j], array[k]));
                        triplet[1] = array[i] + array[j] + array[k] - triplet[2] - triplet[0];
                        result.add(triplet);
                    }
                }
            }
        }
        return result;
    }
}
