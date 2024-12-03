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
/*Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [4,6,7,5,2,9,8,3,1]*/

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr= new ArrayList<>();
        helper(root, arr);
        return arr;

    }
    public void helper(TreeNode node, List<Integer>arr){
        if(node==null){
            return;
        }
        helper(node.left, arr);
        helper(node.right, arr);
        arr.add(node.val);
    }
}