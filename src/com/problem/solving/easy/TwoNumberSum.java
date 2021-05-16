package com.problem.solving.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

    public static void main(String[] args) {
        int array[] = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int result[] = twoNumberSum2(array, targetSum);
        System.out.println(result.length != 0 ? result[0] + " " + result[1] : new int[0]);
    }

    // Brute-Force Method
    // Time Complexity : O(n^2) Space Complexity: O(1)
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int result[] = new int[2];
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int sum = array[i] + array[j];
                if (sum == targetSum) {
                    result[0] = array[i];
                    result[1] = array[j];
                    return result;
                }
            }
        }
        return new int[0];
    }

    // Sort Array
    // Time Complexity : O(n*log n) Space Complexity: O(1)
    public static int[] twoNumberSum2(int[] array, int targetSum) {
        Arrays.sort(array); // O(n log n)
        int left = 0;
        int right = array.length - 1;

        while (left < right) {      // O(n)
            int sum = array[left] + array[right];
            if (sum == targetSum) {
                return new int[]{array[left], array[right]};
            } else if (sum < targetSum) {
                left++;
            } else if (sum > targetSum) {
                right++;
            }
        }
        return new int[0];
    }

    // Using HashMap
    // Time Complexity : O(n) Space Complexity : O(n)
    public static int[] twoNumberSum3(int[] array, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int remainder = targetSum - array[i];
            if (map.containsKey(remainder)) {
                return new int[]{array[map.get(remainder)], array[i]};
            }
            map.put(array[i], i);
        }
        return new int[0];
    }
}
