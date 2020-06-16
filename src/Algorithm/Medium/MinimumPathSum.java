package Algorithm.Medium;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int length=grid[0].length;
        int height=grid.length;

        int[][] distance=new int[height][length];
        distance[0][0]=grid[0][0];

        for (int i=0;i<height;i++){
            for (int j=0;j<length;j++){
                if (i==0 && j==0){

                }
                else if (i==0 && j!=0){
                    distance[i][j]=grid[i][j]+distance[i][j-1];
                }
                else if (j==0 && i!=0){
                    distance[i][j]=grid[i][j]+distance[i-1][j];
                }
                else {
                    distance[i][j]=Math.min((grid[i][j]+distance[i][j-1]),(grid[i][j]+distance[i-1][j]));
                }
            }
        }

        return distance[height-1][length-1];
    }
}
