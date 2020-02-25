package Algorithm.Medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {
    class Solution {
        public int orangesRotting(int[][] grid) {
            int row=grid.length;
            int col=grid[0].length;
            int freshCount=0;
            int result=0;
            Queue<Integer> rottenOranges = new ArrayDeque<>();

            for(int m=0;m<row;m++){
                for(int n=0;n<col;n++){
                    if(grid[m][n]==2){
                        rottenOranges.add(m*10+n);
                    }
                    else if(grid[m][n]==1){
                        freshCount++;
                    }
                }
            }

            while( freshCount!=0 && !rottenOranges.isEmpty()){
                int rottenCount=rottenOranges.size();
                //int temprow=rottenOranges.poll()
                for(int i=0;i<rottenCount;i++){
                    int chosenOrange=rottenOranges.poll();
                    int temprow=chosenOrange/10;
                    int tempcol=chosenOrange%10;
                    if(temprow>=1 && grid[temprow-1][tempcol]==1){
                        rottenOranges.add((temprow-1)*10+tempcol);
                        grid[temprow-1][tempcol]=2;
                        freshCount--;
                    }
                    if(tempcol>=1 && grid[temprow][tempcol-1]==1){
                        rottenOranges.add(temprow*10+(tempcol-1));
                        grid[temprow][tempcol-1]=2;
                        freshCount--;
                    }
                    if(temprow<(row-1) && grid[temprow+1][tempcol]==1){
                        rottenOranges.add((temprow+1)*10+tempcol);
                        grid[temprow+1][tempcol]=2;
                        freshCount--;
                    }
                    if(tempcol<(col-1) && grid[temprow][tempcol+1]==1){
                        rottenOranges.add(temprow*10+(tempcol+1));
                        grid[temprow][tempcol+1]=2;
                        freshCount--;
                    }
                }
                result++;
            }

            if(freshCount>0){
                return -1;
            }
            else{
                return result;
            }
        }
    }
}
