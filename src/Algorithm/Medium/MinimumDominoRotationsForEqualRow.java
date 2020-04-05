package Algorithm.Medium;

public class MinimumDominoRotationsForEqualRow {
    class Solution {
        public int check(int[]A, int[]B,int starter){
            int round1=0;
            int round2=0;

            for(int i=0;i<A.length;i++){
                if(A[i]!=starter && B[i]!=starter){
                    return -1;
                }
                else if(A[i]!=starter){
                    round1++;
                }else if(B[i]!=starter){
                    round2++;
                }
            }
            return Math.min(round1,round2);
        }
        public int minDominoRotations(int[] A, int[] B) {
            int result1=check(A,B,A[0]);
            int result2=check(A,B,B[0]);
            if(result1>=0 && result2>=0){
                return Math.min(result1,result2);
            }else if(result1>=0 || result2>=0){
                return Math.max(result1,result2);
            }
            else{return -1;}


        }
    }
}
