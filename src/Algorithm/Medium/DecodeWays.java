package Algorithm.Medium;
import java.util.*;

public class DecodeWays {
    HashMap<Integer, Integer> memo=new HashMap<>();
    public int Decode(int pointer,String s){
        if(pointer==s.length()){
            return 1;
        }
        if (s.charAt(pointer)=='0'){
            return 0;
        }
        if (pointer==s.length()-1){
            return 1;
        }

        if(memo.containsKey(pointer)){
            return memo.get(pointer);
        }


        int ans=Decode(pointer+1,s);
        if (Integer.parseInt(s.substring(pointer,pointer+2))<=26){
            ans+=Decode(pointer+2,s);
        }

        memo.put(pointer,ans);
        return ans;
    }

    public int numDecodings(String s) {
        if (s.length()==0){
            return 0;
        }else {
            return Decode(0,s);
        }
    }
}
