// 542. 01 Matrix
// Solved
// Medium
// Topics
// Companies
// Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

// The distance between two cells sharing a common edge is 1.

 

// Example 1:


// Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
// Output: [[0,0,0],[0,1,0],[0,0,0]]
// Example 2:


// Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
// Output: [[0,0,0],[0,1,0],[1,2,1]]

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];  // Array to track visited cells
        
        // Step 1: Enqueue all zero cells and mark others as unvisited
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;  // Mark zero cells as visited
                }
            }
        }
        
        // Directions: Right, Down, Left, Up
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        // Step 2: BFS to propagate the distances
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            
            // Check all 4 directions
            for (int[] dir : directions) {
                int newX = x + dir[0], newY = y + dir[1];
                
                // If within bounds and not visited
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY]) {
                    mat[newX][newY] = mat[x][y] + 1;  // Set the new distance
                    visited[newX][newY] = true;        // Mark as visited
                    queue.offer(new int[]{newX, newY});  // Add to the queue for further exploration
                }
            }
        }
        
        return mat;  // Return the updated matrix
    }
}
