// 79. Word Search
// Solved
// Medium
// Topics
// Companies
// Given an m x n grid of characters board and a string word, return true if word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

// Example 1:


// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
// Output: true
// Example 2:


// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
// Output: true
// Example 3:


// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
// Output: false


import java.util.*;

public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        // Step 1: Iterate through the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Step 2: Start DFS if the first character matches
                if (helper(board, word, i, j, 0, new boolean[m][n])) {
                    return true;
                }
            }
        }

        return false;
    }

    // Helper function to perform DFS
    public boolean helper(char[][] board, String word, int x, int y, int index, boolean[][] visited) {
        // Step 3: Base case - if we have matched the whole word
        if (index == word.length()) {
            return true;
        }

        // Step 4: Out of bounds or current cell does not match the character at index
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || visited[x][y] || board[x][y] != word.charAt(index)) {
            return false;
        }

        // Step 5: Mark this cell as visited
        visited[x][y] = true;

        // Step 6: Explore all 4 directions (up, down, left, right)
        boolean found = 
            helper(board, word, x - 1, y, index + 1, visited) ||  // up
            helper(board, word, x + 1, y, index + 1, visited) ||  // down
            helper(board, word, x, y - 1, index + 1, visited) ||  // left
            helper(board, word, x, y + 1, index + 1, visited);    // right

        // Step 7: Backtrack by marking the cell as unvisited
        visited[x][y] = false;

        return found;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input board dimensions
        System.out.print("Enter number of rows: ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int n = scanner.nextInt();

        char[][] board = new char[m][n];

        // Input board elements
        System.out.println("Enter the board characters (one character per cell):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.next().charAt(0);
            }
        }

        // Input the word to search
        System.out.print("Enter the word to search: ");
        String word = scanner.next();

        Solution solution = new Solution();
        boolean exists = solution.exist(board, word);

        // Output the result
        if (exists) {
            System.out.println("The word exists in the board.");
        } else {
            System.out.println("The word does NOT exist in the board.");
        }

        scanner.close();
    }
}
