package Algorithm.Medium;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int length=nums.length;
        int tempsum=0;
        int result=0;

        for(int i=0;i<length;i++){
            tempsum=nums[i];
            if(tempsum>=s){
                result=1;
            }
            for(int j=i+1;j<length;j++){
                tempsum+=nums[j];
                if(tempsum>=s){
                    if(result==0){
                        result=j-i+1;
                    }else{
                        result=Math.min(result,j-i+1);
                    }
                }
            }
        }
        return result;
    }
}
