class Solution {
    public int[] sortedSquares(int[] A) {
        int length=A.length;
        int[] result=new int[length];
        if(length==0){
            return result;
        }
        for(int i=0;i<length;i++){
            result[i]=A[i]*A[i];
        }
        
        Arrays.sort(result);
        return result;
    }
}
