
//BFS using Queue (for a Graph or Grid)
import java.util.*;

class Solution {
    public int shortestPath(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dirs = {-1, 0, 1, 0, 0, -1, 0, 1};  // Directions for up, right, down, left
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});  // Start at (0, 0)
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int x = curr[0], y = curr[1];

                // If we reached the bottom-right corner
                if (x == m - 1 && y == n - 1) return steps;

                // Explore neighbors (up, down, left, right)
                for (int d = 0; d < 4; d++) {
                    int newX = x + dirs[d];
                    int newY = y + dirs[d + 1];
                    if (newX >= 0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == '0' && !visited[newX][newY]) {
                        visited[newX][newY] = true;
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }
            steps++;
        }
        return -1;  // Return -1 if there is no path
    }
}
--------------------------------------------------------------------------------------------------------------

//BFS using Queue (for Tree Traversal)

  import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) queue.offer(currentNode.left);
                if (currentNode.right != null) queue.offer(currentNode.right);
            }

            result.add(currentLevel);
        }

        return result;
    }
}

---------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------
  //DFS using Recursion (for Graph or Grid)

  class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int m = grid.length, n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {  // Found a new island
                    count++;
                    dfs(grid, i, j);  // Mark all connected land as visited
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';  // Mark the cell as visited
        // Explore all 4 neighbors
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}

--------------------------------------------------------------------------------------------------------------------------

  //DFS using Stack (for Graph Traversal)
  import java.util.*;

class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                while (!stack.isEmpty()) {
                    int node = stack.pop();
                    if (visited[node]) continue;
                    visited[node] = true;
                    for (int neighbor : graph.get(node)) {
                        if (!visited[neighbor]) stack.push(neighbor);
                    }
                }
            }
        }
        return components;
    }
}

---------------------------------------------------------------------------------------------------------------------

  //DFS using Recursion (for Tree Traversal)

  class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;

        result.add(node.val);  // Visit the root node
        preorderHelper(node.left, result);  // Traverse left subtree
        preorderHelper(node.right, result);  // Traverse right subtree
    }
}
