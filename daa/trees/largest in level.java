import java.util.*;

public class LargestValueInEachTreeRow {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int maxVal = Integer.MIN_VALUE;

            // Process each node in the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                maxVal = Math.max(maxVal, node.val);

                // Add child nodes to the queue
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            // Add the maximum value of this level to the result
            result.add(maxVal);
        }

        return result;
    }

    public static void main(String[] args) {
        LargestValueInEachTreeRow solver = new LargestValueInEachTreeRow();

        // Example 1: Binary Tree
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);
        root1.left.right = new TreeNode(3);
        root1.right.right = new TreeNode(9);

        List<Integer> result1 = solver.largestValues(root1);
        System.out.println("Largest values in each row: " + result1); // Output: [1, 3, 9]

        // Example 2: Single Node Tree
        TreeNode root2 = new TreeNode(10);

        List<Integer> result2 = solver.largestValues(root2);
        System.out.println("Largest values in each row: " + result2); // Output: [10]
    }
}
