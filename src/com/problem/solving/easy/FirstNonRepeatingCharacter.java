package com.problem.solving.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "abcdcaf";
        System.out.println(firstNonRepeatingCharacter(input));
    }

    /*
     * Time Complexity : O(n) | Space Complexity : O(1)
     */
    public static int firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> map = new HashMap<>();

        for (int idx = 0; idx < string.length(); idx++) {
            char character = string.charAt(idx);
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        for (int idx = 0; idx < string.length(); idx++) {
            char character = string.charAt(idx);
            if (map.get(character) == 1)
                return idx;
        }
        return -1;
    }
}
