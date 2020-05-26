package Algorithm.Easy;
import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1=0;
        for (int i=0;i<n;i++){
            nums1[m+i]=nums2[pointer1];
            pointer1++;
        }
        Arrays.sort(nums1);
    }
}
