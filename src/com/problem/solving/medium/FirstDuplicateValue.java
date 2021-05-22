package com.problem.solving.medium;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValue {

    public static void main(String[] args) {
        int[] array = {2, 1, 5, 2, 3, 3, 4};
        System.out.println(findDuplicateValue2(array));
    }

    /*
     * Time Complexity : O(n) | Space Complexity : O(n)
     */
    public static int findDuplicateValue(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!set.contains(array[i])) {
                set.add(array[i]);
            } else {
                return array[i];
            }
        }
        return -1;
    }

    /*
     * Time Complexity : O(n) | Space Complexity : O(1)
     */
    public static int findDuplicateValue2(int[] array) {
        for (int value : array) {
            int absValue = Math.abs(value);
            if (array[absValue - 1] < 0) {
                return Math.abs(value);
            } else {
                array[absValue - 1] *= -1;
            }
        }
        return -1;
    }
}
