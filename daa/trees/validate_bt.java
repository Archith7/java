98. Validate Binary Search Tree
Solved
Medium
Topics
Companies
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left 
subtree
 of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        // if(root==null)return true;
        // if(root.left!=null){
        //     if(root.left.val>root.val){
        //         return false;
        //     }} 
        // if(root.right!=null){
        //     if(root.right.val<root.val){
        //         return false;
        //     }} 

        //     // (root.right!=null && root.right.val<root.val))return false;
        // return isValidBST(root.left) && isValidBST(root.right);
        
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }
    public boolean helper(TreeNode node, long min, long max){
        if(node==null) return true;

        if(node.val<=min || node.val>=max)return false;

        return helper(node.left, min, node.val) && helper(node.right, node.val, max);
    }
}
