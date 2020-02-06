package Algorithm.Hard;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        if(nums1.length==0 && nums2.length==0){
            return 0.0;
        }
        else if(nums1.length==0){
            result=getMedian(nums2);
            return result;
        }
        else if(nums2.length==0){
            result=getMedian(nums1);
            return result;
        }else{
            int[] temp=new int[nums1.length+nums2.length];
            int p1=0;
            int p2=0;
            int m=0;
            int n=0;

            for(int i=0;i<temp.length;i++){
                if(p1<nums1.length){
                    m=nums1[p1];
                }else if(p1>=nums1.length){
                    m=Integer.MAX_VALUE;
                }

                if(p2<nums2.length){
                    n=nums2[p2];
                }else if(p2>=nums2.length){
                    n=Integer.MAX_VALUE;
                }
                if(m<n){
                    temp[i]=m;
                    p1++;
                }
                else{
                    temp[i]=n;
                    p2++;
                }
            }
            return getMedian(temp);
        }
    }
    public double getMedian(int[] input){
        double median;
        if(input.length%2 == 0){
            double temp1=input[input.length/2];
            double temp2=input[input.length/2-1];
            median=(temp1+temp2)/2;
            return median;
        }
        else{
            median=input[input.length/2];
            return median;
        }
    }
}
