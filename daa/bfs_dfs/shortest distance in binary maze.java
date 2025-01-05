class Solution {

    int shortestPath(int[][] grid, int[] source, int[] destination) {
        if (source[0] == destination[0] && source[1] == destination[1]) {
            return 0;
        }
        Queue<int[]> q= new LinkedList<>();
        int [][]dir={{-1,0},{1,0},{0,-1},{0,1}};
        q.add(new int[] {source[0],source[1]});
        
        int steps=0;
        
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0; i<size; i++){
                int[] cell= q.poll();
                int x=cell[0];
                int y =cell[1];
                
                for(int j=0; j<4; j++){
                    int newx= x + dir[j][0];
                    int newy = y+ dir[j][1];
                    
                    if(newx>=0 && newx<grid.length && newy>=0 && newy<grid[0].length && grid[newx][newy]==1){
                        grid[newx][newy]=0;
                        
                        q.add(new int[]{newx, newy});
                        if (Arrays.equals(new int[]{newx, newy}, new int[]{destination[0], destination[1]})) {
                            return steps + 1;
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
        
    }
}


//simple bfs , maintain a base condition properly , 
//start from the source and check the neighbours
//mark visited
//add visited to the queue, check whether reached the destination at every enqueuing , if so end the loop and return steps

//BFS ITSELF HAVE A SIGNIFICANCE OF DIRECTLY FINDING THE SHORTEST PATH< whenever shortest path , apply bfs.
