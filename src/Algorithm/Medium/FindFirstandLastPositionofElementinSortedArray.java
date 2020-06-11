package Algorithm.Medium;

public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==1 && nums[0]==target){
            return new int[]{0,0};
        }
        int[] result =new int[2];
        result[0]=BinarySearchLeft(nums,target);
        result[1]=BinarySearchRight(nums,target);

        return result;
    }
    public int BinarySearchLeft(int[] nums,int target){
        int low=0;
        int high=nums.length;
        int mid=(low+high)/2;
        boolean find=false;
        while (low<high){
            mid=(low+high)/2;
            if (nums[mid]<target){
                low=mid+1;
            }
            else if (nums[mid]>target || nums[mid]==target){
                high=mid;
                if (nums[mid]==target){
                    find=true;
                }
            }
        }
        if (find) {
            return low;
        }else {
            return -1;
        }
    }
    public int BinarySearchRight(int[] nums, int target){
        int low=0;
        int high=nums.length;
        int mid=(low+high)/2;
        boolean find=false;
        while (low<high){
            mid=(low+high)/2;
            if (nums[mid]<target || nums[mid]==target){
                low=mid+1;
                if (nums[mid]==target){
                    find=true;
                }
            }
            else if (nums[mid]>target){
                high=mid;
            }
        }
        if (find) {
            return high - 1;
        }else {
            return -1;
        }
    }
}
