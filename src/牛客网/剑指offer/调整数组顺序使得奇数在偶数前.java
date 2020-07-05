package 牛客网.剑指offer;

import java.util.ArrayList;

public class Solution {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();

        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                even.add(array[i]);
            }else{
                odd.add(array[i]);
            }
        }

        int oddcounter=0;
        int evencounter=0;

        for(int i=0;i<array.length;i++){
            if(oddcounter<odd.size()){
                array[i]=odd.get(oddcounter);
                oddcounter++;
            }else if(evencounter<even.size()){
                array[i]=even.get(evencounter);
                evencounter++;
            }
        }
    }
}