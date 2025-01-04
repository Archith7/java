class Solution {
    public boolean exist(char[][] board, String word) {
        if(word.length()>board.length*board[0].length){
            return false;
        }
        for(int i=0; i<board.length;i++){
            for(int j=0 ; j< board[0].length ; j++){
                if(helper(board,word,i,j,0)){
                    return true;
                }
            }
        }  
        return false;
    }

    public static boolean helper(char [][]board, String word,int x, int y,int c){
        if(word.length()==c)return true;

        if(x<0 || x>=board.length || y<0 || y>=board[0].length || board[x][y]!=word.charAt(c)){
            return false;
        }
        char temp = board[x][y];
        board[x][y] = '#';
        boolean found=
        helper(board, word, x-1, y, c+1)||
        helper(board, word, x+1, y, c+1)||
        helper(board, word, x, y-1, c+1)||
        helper(board, word, x, y+1, c+1);
        board[x][y] = temp;
        return found;
    }
}


//whl: passing what (arguments) to the helper
//using or || in case of searching
//usage of base conditions , especially while boolean return type
//marking the visited as # and restroring with the actual value
