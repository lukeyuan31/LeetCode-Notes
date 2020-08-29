class Solution {
    int result=0;
    int[] queens;
    public boolean validPlace(int row){
        for(int i=1;i<row;i++){
            if(Math.abs(queens[i]-queens[row])==Math.abs(i-row) || queens[i]==queens[row] ){
                return false;
            }
        }
        return true;
    }
    public void putChess(int row,int n){
        if(row>n){
            result++;
        }
        else{
            for(int i=1;i<=n;i++){
            queens[row]=i;
            if(validPlace(row)){                
                putChess(row+1,n);
            }
        }
            }
        
    }
    public int totalNQueens(int n) {
        queens=new int[n+1];
        putChess(1,n);
        return result;
    }
}
