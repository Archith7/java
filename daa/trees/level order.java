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
        List<List<Integer>> arr = new ArrayList<>();
        if(root==null)return arr;

        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int siz= q.size();

            for(int i=0 ; i<siz ;i++){
                TreeNode currentnode= q.poll();
                level.add(currentnode.val);

                if(currentnode.left!=null){
                    q.offer(currentnode.left);
                }
                if(currentnode.right!=null){
                    q.offer(currentnode.right);
                }
            }
            arr.add(level);
        }
        return arr;

    }
    
}

//whl:maintain a queue for first visit nodes
//as level wise , first deal with the nodes in queue , retreive and append those values to "level" list (or can apply other logics also) ; then check the existance 
// of just neighbours , if exist enqueue , else ntg and repeat the same
//ultimately the flavouur of bfs begins
