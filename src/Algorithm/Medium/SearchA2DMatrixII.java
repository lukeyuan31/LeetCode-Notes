package Algorithm.Medium;

public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==0 || matrix[0].length==0){
            return false;
        }
        int length = matrix[0].length;
        int height = matrix.length;

        for (int i = 0; i < height; i++) {
            if (matrix[i][0] > target) {
                return false;
            }
            else {
                for (int j=0;j<length;j++) {
                    if (matrix[i][j]>target){
                        length=j;
                    }
                    else if (matrix[i][j]==target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
