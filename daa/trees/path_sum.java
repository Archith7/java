112. Path Sum
Solved
Easy
Topics
Companies
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return haspa(root, targetSum);
    }

    public boolean haspa(TreeNode node, int targetSum){
        if(node==null ){
            return false;
        }
        if( (node.left==null && node.right==null)){
            return node.val==targetSum;
        }
        // if(node.val != null){
        //     targetSum-=node.val;
        // }

        return haspa(node.left, targetSum-node.val) || haspa(node.right, targetSum-node.val);
    }
}
