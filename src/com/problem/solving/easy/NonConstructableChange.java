package com.problem.solving.easy;

import java.util.Arrays;

public class NonConstructableChange {

    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        int change = nonConstructableChange(coins);
        System.out.println(change);
    }

    public static int nonConstructableChange(int[] coins) {
        Arrays.sort(coins);
        int change = 0;
        for (int coin : coins) {
            if (coin > change + 1) {
                return change + 1;
            }
            change += coin;
        }
        return change + 1;
    }
}
