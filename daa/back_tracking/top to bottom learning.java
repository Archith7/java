public class GridBacktracking {
    // Function to solve the problem
    public static void findPaths(int[][] grid, boolean[][] visited, int row, int col, String path) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Base case: Reached bottom-right corner
        if (row == rows - 1 && col == cols - 1) {
            System.out.println(path);
            return;
        }

        // Check if the current move is valid
        if (row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] == 0 || visited[row][col]) {
            return;
        }

        // Mark the cell as visited
        visited[row][col] = true;

        // Explore all 4 directions
        findPaths(grid, visited, row + 1, col, path + "D"); // Down
        findPaths(grid, visited, row - 1, col, path + "U"); // Up
        findPaths(grid, visited, row, col + 1, path + "R"); // Right
        findPaths(grid, visited, row, col - 1, path + "L"); // Left

        // Undo the move (backtrack)
        visited[row][col] = false;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        boolean[][] visited = new boolean[3][3];

        // Start from top-left corner
        findPaths(grid, visited, 0, 0, "");
    }
}


//whl:simple as dfs template, {if cond, marking visited , recursive call,MAKE SURE MAINTAIN A BASE CONDITION}
//what's the difference: we just make the visited cels false again while bactracking ,for further usage in next track
