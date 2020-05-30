package Algorithm.Medium;

public class MaximalSquare {
    public int findSquare(char[][] matrix, int x, int y){
        int max=Math.min(matrix[0].length-y-1,matrix.length-x-1);
        int length=0;
        for (int i=1;i<=max;i++){
            for(int m=y;m<=y+i;m++){
                if (matrix[x+i][m]=='0'){
                    length=i-1;
                    return length;
                }
                //break;
            }
            for (int n=x;n<=x+i;n++){
                if (matrix[n][y+i]=='0'){
                    length=i-1;
                    return length;
                }
                //break;
            }
            length=i;
        }
        return length;
    }

    public int maximalSquare(char[][] matrix) {
        int SqLength=0;
        if (matrix.length==0){
            return 0;
        }
        boolean have=false;

        int length=matrix[0].length;
        int height=matrix.length;

        for (int m=0;m<height;m++){
            for (int n=0;n<length;n++){
                if (matrix[m][n]=='1'){
                    have=true;
                    int temp=findSquare(matrix,m,n);
                    SqLength=Math.max(temp,SqLength);
                }
            }
        }
        if(have==false){
            return 0;
        }
        else{
            return (SqLength+1)*(SqLength+1);
        }

    }
}
