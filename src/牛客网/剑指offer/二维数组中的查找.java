package 牛客网.剑指offer;

class Solution {
    public boolean Find(int target, int [][] array) {
        int width=array[0].length;
        int height=array.length;
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(array[i][j]>target){
                    width=j+1;
                }
                else if(array[i][j]==target){
                    return true;

                }
            }
        }
        return false;
    }
}
