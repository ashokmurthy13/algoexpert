package com.problem.solving.easy;

public class PalindromeCheck {

    public static void main(String... args) {
        String str1 = "abcdcba";
        String str2 = "algoexpert";
        String str3 = "a";
        String str4 = "abcdefghhgfedcba";
        String str5 = "abba";

        System.out.println("Is " + str1 + " a palindrome: " + isPalindrome(str1));
        System.out.println("Is " + str2 + " a palindrome: " + isPalindrome(str2));
        System.out.println("Is " + str3 + " a palindrome: " + isPalindrome(str3));
        System.out.println("Is " + str4 + " a palindrome: " + isPalindrome(str4));
        System.out.println("Is " + str5 + " a palindrome: " + isPalindrome(str5));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static boolean isPalindrome(String str) {
        int leftIdx = 0;
        int rightIdx = str.length() - 1;
        while (leftIdx < rightIdx) {
            if (str.charAt(leftIdx) != str.charAt(rightIdx)) {
                return false;
            }
            leftIdx++;
            rightIdx--;
        }
        return true;
    }
}