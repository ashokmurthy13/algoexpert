package com.problem.solving.easy;

import java.util.*;

public class TournamentWinner {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);

        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 1));
        System.out.println(findTournamentWinner(competitions, results));
    }

    /*
     * Time Complexity : O(n) - n is number of competitions
     * Space Complexity : O(k) - k is number of teams
     */
    public static String findTournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> map = new TreeMap<>();
        String wonTeam = null;
        for (int i = 0; i < results.size(); i++) {
            int result = results.get(i);
            if (result == 0) {
                wonTeam = competitions.get(i).get(result + 1);
            } else if (result == 1) {
                wonTeam = competitions.get(i).get(result - 1);
            }
            map.put(wonTeam, map.getOrDefault(wonTeam, 0) + 3);
        }
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }
}
