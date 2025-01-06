
public class count_paths {

    public static int helper(int[][] grid, boolean[][]visited, int x, int y ) {
        int rows=grid.length;
        int cols=grid[0].length;

        if(x==rows-1 && y==cols-1){
            // System.out.println(c);
            return 1;
        }

        if(x<0 || x>=rows || y<0 || y>=cols || grid[x][y]!=1 || visited[x][y] ){
            return 0;
        }

        visited[x][y]=true;
        int c=0;
        c+=helper(grid, visited, x + 1, y); // Down
        c+=helper(grid, visited, x - 1, y); // Up
        c+=helper(grid, visited, x, y + 1); // Right
        c+=helper(grid, visited, x, y - 1);
        visited[x][y]=false;

        return c;
    }
    public static void main(String[] args) {
        int[][]grid={{1,1,1},{1,0,1},{1,1,1}};
        boolean[][] visited= new boolean[3][3];
        int c=helper(grid, visited ,0,0);
        System.out.println(c);
    }
}


//whl:incase of counting in back tracking , the same logic persists just an additional variable will be maintained and will vbe incremented 
//...for every successful target finding
