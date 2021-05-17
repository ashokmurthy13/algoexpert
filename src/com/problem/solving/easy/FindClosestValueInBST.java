package com.problem.solving.easy;

public class FindClosestValueInBST {

    public static void main(String[] args) {
        BST root = new FindClosestValueInBST.BST(10);
        root.left = new FindClosestValueInBST.BST(5);
        root.left.left = new FindClosestValueInBST.BST(2);
        root.left.left.left = new FindClosestValueInBST.BST(1);
        root.left.right = new FindClosestValueInBST.BST(5);
        root.right = new FindClosestValueInBST.BST(15);
        root.right.left = new FindClosestValueInBST.BST(13);
        root.right.left.right = new FindClosestValueInBST.BST(14);
        root.right.right = new FindClosestValueInBST.BST(22);
        int target = 24;
        int closest = root.value;
        System.out.println(findClosestValueInBst(root, target, closest));
    }

    /*
     * Time Complexity : O(lon n) | Space Complexity : O(log n)
     */
    public static int findClosestValueInBst(BST root, int target, int closest) {

        if (Math.abs(target - closest) > Math.abs(target - root.value)) {
            closest = root.value;
        }
        if (target > root.value && root.right != null) {
            return findClosestValueInBst(root.right, target, closest);
        } else if (target < root.value && root.left != null) {
            return findClosestValueInBst(root.left, target, closest);
        } else {
            return closest;
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
