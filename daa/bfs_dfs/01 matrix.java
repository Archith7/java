
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new int[]{i, j}); 
                } else {
                    mat[i][j] = -1; 
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll(); 
            int x = cell[0]; 
            int y = cell[1]; 

            for (int d = 0; d < 4; d++) {
                int newX = x + directions[d][0]; 
                int newY = y + directions[d][1]; 

                if (newX >= 0 && newX < m && newY >= 0 && newY < n && mat[newX][newY] == -1) {
                    mat[newX][newY] = mat[x][y] + 1; 
                    queue.add(new int[]{newX, newY}); 
                }
            }
        }

        return mat;
    }
}


//whh: just mark 1's as unvisited , only enque the 0's coordinates
//later visit only the o's , check its neighbours by cond -1, if so then make that coordinate value as the value of current coordinate value (0 in this case) +1
//then add this newly modified cordinate to queue to check for its further neighbours , if found again the current coordinate value (1 in this case) +1
