package 牛客网.剑指offer;

public class Solution {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }


    }
}
