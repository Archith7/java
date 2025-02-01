// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

// Example 1:

// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1
// Example 2:

// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3


class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<grid.length ;i++){
            for(int j=0; j< grid[0].length; j++){
                if(grid[i][j]=='1'){
                    count++;
                    helper(grid, i , j);
                }
            }
        }

        
        return count;
    }
    public static void helper(char[][] grid ,int x, int y ){
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]=='0'){
            return;
        }
        grid[x][y]='0';
        
        helper(grid, x-1,y);
        helper(grid, x+1,y);
        helper(grid, x,y-1);
        helper(grid, x,y+1);
    }
}
