package Algorithm.Medium;

import java.util.HashMap;
import java.util.Map;

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        Map<String,Integer> map =new HashMap<String, Integer>();
        if (nums.length==0){
            return -1;
        }
        if(nums.length==1){
            if(target==nums[0]){
                return 0;
            }
            else{
                return -1;
            }
        }
        int head=nums[0];
        int length=nums.length;
        int tail=nums[length-1];
        int counter=0;
        if(target<head && target>tail){
            return -1;
        }
        if(target>=head){
            while(counter <length && nums[counter]<=target){
                if(nums[counter]==target){
                    return counter;
                }
                counter++;
            }
            return -1;
        }
        if(target<=tail){
            counter=length-1;
            while(counter>=0 && nums[counter]>=target){
                if(nums[counter]==target){
                    return counter;
                }
                counter--;
            }
            return -1;
        }
        return 1;
    }
}
