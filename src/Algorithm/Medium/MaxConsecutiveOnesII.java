class Solution {
    public int maxLength(int[] input){
        int left=0;
        int right=0;
        int max=0;
        while(right<input.length){
            if(input[right]==0){
                max=Math.max(right-left,max);
                right++;
                left=right;
            }else{
                right++;
            }
        }
        max=Math.max(right-left,max);
        return max;
        
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int result=maxLength(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=1;
                int temp=maxLength(nums);
                result=Math.max(result,temp);
                nums[i]=0;
            }
        }
        return result;
    }
}
