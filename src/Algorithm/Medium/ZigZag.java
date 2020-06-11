package Algorithm.Medium;
import java.util.ArrayList;
import java.util.List;

public class ZigZag {
    public String convert(String s, int numRows) {
        List<String> lists=new ArrayList<>();
        for (int i=0;i<numRows;i++) {
            lists.add("");
        }
        int pointer=0;
        int length=s.length();
        boolean up=true;
        for (int i=0;i<length;i++){
            //String temp=lists.get(pointer);
            //temp=temp+String.valueOf(s.charAt(i));
            lists.set(pointer,lists.get(pointer)+String.valueOf(s.charAt(i)));
            if (up && pointer<numRows-1){
                pointer++;
            }
            else if (!up && pointer>0){
                pointer--;
            }
            if (pointer==numRows-1){
                up=false;
            }else if (pointer==0){
                up=true;
            }
        }

        StringBuilder result= new StringBuilder();
        for (int m=0;m<numRows;m++){
            result.append(lists.get(m));
        }
        return result.toString();
    }
}
