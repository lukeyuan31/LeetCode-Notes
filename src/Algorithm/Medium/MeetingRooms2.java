package Algorithm.Medium;

import java.util.Arrays;

public class MeetingRooms2 {
    class Solution {
        public int minMeetingRooms(int[][] intervals) {
            int length=intervals.length;
            int[] start=new int[length];
            int[] end=new int[length];

            for (int i=0;i<length;i++){
                start[i]=intervals[i][0];
                end[i]=intervals[i][1];
            }

            Arrays.sort(start);
            Arrays.sort(end);

            int result=0;
            int endPointer=0;


            for(int i=0;i<length;i++){
                if (start[i]>=end[endPointer]){
                    endPointer++;
                }else {
                    result++;
                }
            }
            return result;
        }
    }
}
