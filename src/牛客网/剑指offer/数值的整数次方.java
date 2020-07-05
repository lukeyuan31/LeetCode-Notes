package 牛客网.剑指offer;

public class Solution {
    public double Power(double base, int exponent) {
        double result=1.0;
        if(exponent==0){
            return 1.0;
        }
        if(exponent<0){
            base=1/base;
            exponent=-exponent;
        }

        for(int i=1;i<=exponent;i++){
            result=result*base;
        }

        return result;
    }
}