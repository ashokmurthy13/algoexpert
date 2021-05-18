package com.problem.solving.easy;

import java.util.Arrays;

public class SortedSquaredArray {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 5, 6, 8, 9};
        int array2[] = {-4, -1};
        int array3[] = {-10, -5, 0, 5, 10};
        int[] array4 = {-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20};

        int sortedSquaredArray[] = solution2(array4);
        for (int i = 0; i < sortedSquaredArray.length; i++) {
            System.out.print(sortedSquaredArray[i] + " ");
        }
    }

    /*
     * Time Complexity : O(nlogn) | Space Complexity : O(n)
     */
    private static int[] solution1(int[] array) {
        int sortedSquareArray[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int squareValue = array[i];
            sortedSquareArray[i] = squareValue * squareValue;
        }
        Arrays.sort(sortedSquareArray);
        return sortedSquareArray;
    }

    /*
     * Time Complexity : O(n) | Space Complexity : O(n)
     */
    private static int[] solution2(int[] array) {
        int[] sortedSquareArray = new int[array.length];
        int smallerValueIndex = 0;
        int largerValueIndex = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            int smallerValue = array[smallerValueIndex];
            int largerValue = array[largerValueIndex];
            if (Math.abs(smallerValue) > Math.abs(largerValue)) {
                sortedSquareArray[i] = smallerValue * smallerValue;
                smallerValueIndex++;
            } else {
                sortedSquareArray[i] = largerValue * largerValue;
                largerValueIndex--;
            }
        }
        return sortedSquareArray;
    }
}
