package Algorithm.Easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    private int getNext(int n){
        int sum=0;
        while(n>0){
            int d = n%10;
            n=n/10;
            sum=sum+d*d;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=getNext(n);
        }
        return n==1;
    }
}
