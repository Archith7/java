import java.util.*;

public class flood_fill{
    public static void main(String[] args) {
        System.out.println("enter the size of the grid");
        Scanner sc = new Scanner(System.in);
        List <Integer> l = new ArrayList<>();
        for(int i=0; i<2; i++){
            l.add(sc.nextInt());
        }
        System.out.println("input the elements of grid :"+l);

       int r=l.get(0);
       int c=l.get(1);

       int [][] grid= new int[r][c];
       for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            grid[i][j]=sc.nextInt();
        }
    }

    System.out.println("Enter the targeted row and column number:");
    int x=sc.nextInt();
    int y=sc.nextInt();

    System.out.println("Enter the new colour digit:");
    int newcol = sc.nextInt();

    if (newcol==grid[x][y]) {
        System.out.println("hushhh!!");
        return;
    }    
    help(grid, x , y, newcol, grid[x][y]);

    for(int i=0; i<r;i++){
        for (int j = 0; j < c; j++) {
            System.out.print(grid[i][j]);
        }
        System.out.println("");
    }
    }
    public static void help(int[][] arr, int x, int y, int newcol, int original){
        // System.out.println("the image is"+arr[0][1]+x+y+newcol);
        if(x<0 || x>=arr.length || y<0 || y>=arr[0].length || arr[x][y]!=original ){
            // System.out.println("uffff");
            return;
        }
        arr[x][y]=newcol;
        help(arr,x-1,y,newcol, original);
        help(arr,x+1,y,newcol, original);
        help(arr,x,y-1,newcol, original);
        help(arr,x,y+1,newcol, original);

    }
}

//whl: creating the grid,
//traversing through the grid , checking edges and base cond
