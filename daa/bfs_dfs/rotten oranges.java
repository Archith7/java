class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q= new LinkedList<>();
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        int fresh=0;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0)return 0;
        int length=0;
        while(!q.isEmpty()){
            int size=q.size();
            boolean rott=false;

            for(int c=0; c<size; c++){
            int []cell= q.poll();
            int x=cell[0];
            int y=cell[1];

            for(int i=0; i<4; i++){
                int newx= x+dir[i][0];
                int newy= y+ dir[i][1];

                if(newx>=0 && newx<grid.length && newy>=0 && newy<grid[0].length && grid[newx][newy]==1){
                    grid[newx][newy]=2;
                    // length++;
                    q.add(new int[]{newx,newy});
                    fresh--;
                    rott=true;
                }
            }
            }
            if(rott)length++;
        }

        return fresh==0?length :-1;
    }
}

//whh:simple bfs , just locating & enqueing 2 and checking upon neighbours of those q items for 1 , if 1 make it rotten (2) ,
//enqueue for further neighbour checking, BUT TO BE DONE IN LEVELWISE stimulating the minutes
//with extra monitoring like fresh left, counting time 
