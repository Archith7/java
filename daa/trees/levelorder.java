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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        List<List<Integer>> wrap= new LinkedList<List<Integer>>();
        if(root==null){return wrap;}
        q.offer(root);
        while(!q.isEmpty()){
            ArrayList<Integer> sub= new ArrayList<Integer>();
            int x= q.size();
            for(int i=0; i<x; i++){
                TreeNode z= q.peek();
                if(z.left!=null){
                    q.offer(z.left);
                }
                if(z.right!=null){
                    q.offer(z.right);
                }
                sub.add(q.poll().val);
            }
            wrap.add(sub);
        }
        return wrap;
    }
}
