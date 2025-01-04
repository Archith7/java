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

//whl:very simple way of finding the islands
//helper==generalised bfs algo (base cond, marking visited, recursion)
//just finding 1, increasing the count , then makin all corresponding 1's as 0
