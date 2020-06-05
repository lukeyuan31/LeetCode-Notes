package Algorithm.Medium;
import java.util.*;

public class DecodeString {
    public String decodeString(String s) {
        int pointer=0;
        boolean add=true;
        int length=s.length();
        Stack<Integer> intStack=new Stack<>();
        Stack<String> StrStack=new Stack<>();
        //String result="";
        String temp="";

        while (pointer<length){
            char current=s.charAt(pointer);
            //情况1：数字，数字压入数字栈内，当前字符串压入字符串内
            if (Character.isDigit(s.charAt(pointer))){
                int count=0;
                while (Character.isDigit(s.charAt(pointer))){
                    count=10*count+s.charAt(pointer)-'0';
                    pointer++;
                }
                intStack.push(count);
                StrStack.push(temp);
                temp="";
                pointer++;
            }
            else if(current=='['){
                pointer++;
            }

            //情况3：右括号
            else if (current==']'){
                int times=intStack.pop();
                StringBuffer temp2=new StringBuffer(StrStack.pop());
                temp2.append(temp.repeat(Math.max(0, times)));
                temp=temp2.toString();
                pointer++;
            }else{
                //情况2：字母，添加到当前保存的string中
                temp=temp+s.charAt(pointer);
                //temp="";
                pointer++;
            }

            //pointer++;
        }
        return temp;
    }
}
