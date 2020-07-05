package 牛客网.剑指offer;

public class Solution {
    public int JumpFloor(int target) {
        if(target==0){
            return 1;
        }
        if(target==1){
            return 1;
        }

        return JumpFloor(target-1)+JumpFloor(target-2);

    }
}