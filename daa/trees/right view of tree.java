import java.util.*;

public class RightSideViewOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            // Traverse all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                // If this is the last node of the level, add it to the result
                if (i == levelSize - 1) {
                    result.add(node.val);
                }

                // Add left and right children to the queue
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RightSideViewOfBinaryTree solver = new RightSideViewOfBinaryTree();

        // Example 1: Binary Tree
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(4);

        List<Integer> result1 = solver.rightSideView(root1);
        System.out.println("Right side view: " + result1); // Output: [1, 3, 4]

        // Example 2: Single Node Tree
        TreeNode root2 = new TreeNode(10);

        List<Integer> result2 = solver.rightSideView(root2);
        System.out.println("Right side view: " + result2); // Output: [10]
    }
}
