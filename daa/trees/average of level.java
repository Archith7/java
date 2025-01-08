import java.util.*;

public class AverageOfLevelsInBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        if (root == null) return averages;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double levelSum = 0;

            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;

                // Add child nodes to the queue
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            // Calculate average for the current level
            averages.add(levelSum / levelSize);
        }

        return averages;
    }

    public static void main(String[] args) {
        AverageOfLevelsInBinaryTree solver = new AverageOfLevelsInBinaryTree();

        // Example 1: Binary Tree
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        List<Double> result1 = solver.averageOfLevels(root1);
        System.out.println("Average of levels: " + result1); // Output: [3.0, 14.5, 11.0]

        // Example 2: Single Node Tree
        TreeNode root2 = new TreeNode(1);

        List<Double> result2 = solver.averageOfLevels(root2);
        System.out.println("Average of levels: " + result2); // Output: [1.0]
    }
}
