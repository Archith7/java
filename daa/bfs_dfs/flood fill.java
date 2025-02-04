// easy
//   You are given an image represented by an m x n grid of integers image, where image[i][j] represents the pixel value of the image. You are also given three integers sr, sc, and color. Your task is to perform a flood fill on the image starting from the pixel image[sr][sc].

// To perform a flood fill:

// Begin with the starting pixel and change its color to color.
// Perform the same process for each pixel that is directly adjacent (pixels that share a side with the original pixel, either horizontally or vertically) and shares the same color as the starting pixel.
// Keep repeating this process by checking neighboring pixels of the updated pixels and modifying their color if it matches the original color of the starting pixel.
// The process stops when there are no more adjacent pixels of the original color to update.
// Return the modified image after performing the flood fill.

DFS

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        // If the original color is the same as the target color, no need to change anything
        if (originalColor != color) {
            dfs(image, sr, sc, originalColor, color);
        }
        return image;
    }
    
    private void dfs(int[][] image, int r, int c, int originalColor, int color) {
        // Base case: Out of bounds or the color is different from the original color
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != originalColor) {
            return;
        }
        
        // Change the color of the current pixel
        image[r][c] = color;
        
        // Recur for the four adjacent pixels
        dfs(image, r + 1, c, originalColor, color); // Down
        dfs(image, r - 1, c, originalColor, color); // Up
        dfs(image, r, c + 1, originalColor, color); // Right
        dfs(image, r, c - 1, originalColor, color); // Left
    }
}




BFS


import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        // If the original color is the same as the target color, no need to change anything
        if (originalColor == color) {
            return image;
        }
        
        // Create a queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = color;
        
        // Directions: Down, Up, Right, Left
        int[] directions = {0, 1, 0, -1, 0}; 
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            
            // Explore all 4 directions
            for (int i = 0; i < 4; i++) {
                int newRow = r + directions[i];
                int newCol = c + directions[i + 1];
                
                // Check if the new pixel is within bounds and has the original color
                if (newRow >= 0 && newRow < image.length && newCol >= 0 && newCol < image[0].length && image[newRow][newCol] == originalColor) {
                    image[newRow][newCol] = color;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
        return image;
    }
}
