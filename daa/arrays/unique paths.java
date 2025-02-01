// There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). 
// The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right 
//   at any point in time.

// Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.


class Solution {
    public int uniquePaths(int m, int n) {
        int [] row= new int[n];
        Arrays.fill(row,1);

        for(int i=1;i<m;i++){
            int [] newrow = new int[n];
            Arrays.fill(newrow,1);
            for(int j=1;j<n;j++){
                newrow[j]=newrow[j-1]+row[j];
            }
            row=newrow;
        }
        return row[n-1];
    }
}
