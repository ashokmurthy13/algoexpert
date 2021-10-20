package com.problem.solving.hard;

import java.util.Arrays;

public class QuickSortImpl {

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 9, 5, 6, 3};
        System.out.println(Arrays.toString(arr));
        int[] sortedArray = quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sortedArray));
    }

    // Time complexity : O(nlog(n))
    // Space Complexity: O(log(n))
    private static int[] quickSort(int[] arr, int startIdx, int endIdx) {
        // check base case
        if (startIdx >= endIdx) return arr;

        // use pivot element(left, right or random)
        int pivotIdx = startIdx;
        int leftIdx = startIdx + 1;
        int rightIdx = endIdx;

        while (rightIdx >= leftIdx) {
            if (arr[leftIdx] > arr[pivotIdx] && arr[rightIdx] < arr[pivotIdx]) {
                swap(leftIdx, rightIdx, arr);
            }
            if (arr[leftIdx] <= arr[pivotIdx]) {
                leftIdx += 1;
            }
            if (arr[rightIdx] >= arr[pivotIdx]) {
                rightIdx -= 1;
            }
        }
        swap(pivotIdx, rightIdx, arr);

        boolean leftSubArrayIsSmaller = rightIdx - 1 - startIdx < endIdx - (rightIdx + 1);
        if (leftSubArrayIsSmaller) {
            quickSort(arr, startIdx, rightIdx - 1);
            quickSort(arr, rightIdx + 1, endIdx);
        } else {
            quickSort(arr, rightIdx + 1, endIdx);
            quickSort(arr, startIdx, rightIdx - 1);
        }
        return arr;
    }

    private static void swap(int leftIdx, int rightIdx, int[] arr) {
        int temp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = temp;
    }
}
