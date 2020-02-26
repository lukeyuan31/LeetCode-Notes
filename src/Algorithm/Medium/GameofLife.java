package Algorithm.Medium;

public class GameofLife {
    class Solution {
        public void gameOfLife(int[][] board) {
            int width=board.length;
            int height=board[0].length;
            int[][] newBoard=new int[width][height];
            for(int i=0;i<width;i++){
                for(int j=0;j<height;j++){
                    newBoard[i][j]=0;
                }
            }
            int[] neighbors={0,-1,1};


            for(int m=0;m<width;m++){
                for(int n=0;n<height;n++){
                    if(board[m][n]==1){
                        for(int i=0;i<3;i++){
                            for (int j=0;j<3;j++){
                                if(!(neighbors[i]==0 && neighbors[j]==0)){
                                    int r=(m+neighbors[i]);
                                    int c=(n+neighbors[j]);
                                    if((r<width && r>=0) && (c<height&&c>=0)){
                                        newBoard[r][c]=newBoard[r][c]+1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for(int i=0;i<width;i++){
                for(int j=0;j<height;j++){
                    if(newBoard[i][j]<2 || newBoard[i][j]>3){
                        board[i][j]=0;
                    }
                    else {
                        if((board[i][j]==0) && newBoard[i][j]==3 ){
                            board[i][j]=1;
                        }
                    }
                }
            }

            //return newBoard;

        }
    }
}
