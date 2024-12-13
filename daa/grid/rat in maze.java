import java.util.*;

public class Solution {
    // Function to find all possible paths
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> paths = new ArrayList<>();
        int n = mat.size();

        // If the starting cell is blocked, return an empty list
        if (mat.get(0).get(0) == 0 || mat.get(n - 1).get(n - 1) == 0) {
            return paths;
        }

        boolean[][] visited = new boolean[n][n];
        findPathsUtil(mat, 0, 0, n, "", visited, paths);
        
        // Sort the paths in lexicographical order
        Collections.sort(paths);
        return paths;
    }

    // Utility function for finding paths
    private void findPathsUtil(ArrayList<ArrayList<Integer>> mat, int row, int col, int n, String path, boolean[][] visited, ArrayList<String> paths) {
        // If the destination is reached, add the path to the list
        if (row == n - 1 && col == n - 1) {
            paths.add(path);
            return;
        }

        // Mark the current cell as visited
        visited[row][col] = true;

        // Define the directions and corresponding moves
        int[] dRow = {1, 0, 0, -1}; // Down, Right, Left, Up
        int[] dCol = {0, 1, -1, 0};
        char[] directions = {'D', 'R', 'L', 'U'};

        for (int i = 0; i < 4; i++) {
            int newRow = row + dRow[i];
            int newCol = col + dCol[i];

            // Check if the new position is valid
            if (isSafe(mat, newRow, newCol, n, visited)) {
                findPathsUtil(mat, newRow, newCol, n, path + directions[i], visited, paths);
            }
        }

        // Backtrack by unmarking the current cell
        visited[row][col] = false;
    }

    // Function to check if a move is valid
    private boolean isSafe(ArrayList<ArrayList<Integer>> mat, int row, int col, int n, boolean[][] visited) {
        return row >= 0 && row < n && col >= 0 && col < n && mat.get(row).get(col) == 1 && !visited[row][col];
    }

    // Main function to test the implementation
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(1, 0, 0, 0)));
        mat.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
        mat.add(new ArrayList<>(Arrays.asList(1, 1, 0, 0)));
        mat.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));

        Solution solution = new Solution();
        ArrayList<String> result = solution.findPath(mat);
        System.out.println(result); // Output: [DDRDRR, DRDDRR]
    }
}
