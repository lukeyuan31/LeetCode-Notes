package Algorithm.Hard;

public class TrappingRainWater {
    public int trap(int[] height) {
        if(height.length==0){
            return 0;
        }
        int left=0;
        int right=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int ans = 0;
        while (left < right){
            if (height[left]>leftMax){
                leftMax=height[left];
            }
            if (height[right]>rightMax){
                rightMax=height[right];
            }
            if (leftMax<rightMax){
                ans=ans+leftMax-height[left];
                left++;
            }
            else{
                ans=ans+rightMax-height[right];
                right--;
            }
        }
        return ans;
    }
}
