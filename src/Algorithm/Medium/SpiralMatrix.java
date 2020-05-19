package Algorithm.Medium;
import java.util.*;
public class SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            if(matrix.length==0){
                return new ArrayList<>();
            }

            int up=0;
            int left=0;
            int down=matrix.length-1;
            int right=matrix[0].length-1;

            int counter=0;

            List<Integer> result=new ArrayList<>();

            while(up<=down && left<=right){
                for (int i=left;i<=right;i++){
                    result.add(matrix[up][i]);
                }
                for (int i=up+1;i<=down;i++){
                    result.add(matrix[i][right]);
                }

                if (left<right && up<down){
                    for (int i=right-1;i>left;i--){
                        result.add(matrix[down][i]);
                    }
                    for (int i=down;i>up;i--){
                        result.add(matrix[i][left]);
                    }
                }


                left++;
                right--;
                up++;
                down--;


            }
            return result;
        }
    }
}
