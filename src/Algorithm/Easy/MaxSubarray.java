package Algorithm.Easy;

public class MaxSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {

            int result=nums[0];
            int temp=nums[0];

            for(int i=1;i<nums.length;i++){
                temp=Math.max((temp+nums[i]),nums[i]);
                result=Math.max(temp,result);
            }

            return result;
        }
    }
}
