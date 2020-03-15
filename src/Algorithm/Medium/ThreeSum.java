package Algorithm.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int length=nums.length;
            Arrays.sort(nums);
            //List<Integer> unit=new ArrayList<Integer>();
            List<List<Integer>> result=new ArrayList<>();

            for (int i=0;i<nums.length-2;i++){
                int current=nums[i];
                int left=i+1;
                int right=length-1;
                if(i!=0 && current==nums[i-1]){
                    continue;
                }
                while(left!=right){
                    if ((nums[i]+nums[left]+nums[right])>0){
                        right--;
                    }else if(nums[i]+nums[left]+nums[right]<0){
                        left++;
                    }else{
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        while(nums[left]==nums[left-1]&&left!=right){
                            left++;
                        }
                    }
                }


            }
            return result;
        }
    }
}
