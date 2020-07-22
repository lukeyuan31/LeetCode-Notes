package 牛客网.剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 字符串排序 {
    public void backtrack(int n, ArrayList<String> str, ArrayList<String> output, int first){
        if(first==n){
            String temp="";
            for (String s:str){
                temp=temp+s;
            }
            output.add(temp);
        }

        for (int i = first;i<n;i++){
            Collections.swap(str,first,i);
            backtrack(n,str,output,first+1);
            Collections.swap(str,first,i);
        }
    }
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> str_list=new ArrayList<>();

        for (int i=0;i<str.length();i++){
            str_list.add(String.valueOf(str.charAt(i)));
        }

        int n=str.length();
        backtrack(n,str_list,result,0);
        ArrayList<String> no_repeat_result=new ArrayList<String>(new HashSet<String>(result));
        Collections.sort(no_repeat_result);
        return no_repeat_result;
        
    }
}
