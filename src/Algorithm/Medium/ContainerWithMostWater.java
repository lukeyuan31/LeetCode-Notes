package Algorithm.Medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int result=0;
        int length=height.length;
        int area;

        for (int i=0;i<length-1;i++){
            for (int j=i+1;j<length;j++){
                area=Math.min(height[i],height[j])*(j-i);
                if (area>result){
                    result=area;
                }
            }
        }
        return result;
    }
}
