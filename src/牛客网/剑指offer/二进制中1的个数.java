package 牛客网.剑指offer;

public class Solution {
    public int NumberOf1(int n) {
        String str=Integer.toBinaryString(n);
        int result=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                result++;
            }
        }
        return result;

    }
}
