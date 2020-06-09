package Algorithm.Medium;
import java.util.*;

public class IntervalIntersection {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int pointer1=0;
        int length1=A.length;
        int pointer2=0;
        int length2=B.length;
        int ceiling=Math.max(length1,length2);
        List<int[]> result=new ArrayList<>();

        while (pointer1<length1 && pointer2<length2) {
            int max=Math.max(A[pointer1][0],B[pointer2][0]);
            int min=Math.min(A[pointer1][1],B[pointer2][1]);
            if (max<=min) {
                result.add(new int[]{max,min});
            }
            if (A[pointer1][1]<B[pointer2][1]){
                pointer1++;
            }
            else{
                pointer2++;
            }

        }
        return result.toArray(new int[result.size()][]);
    }
}
