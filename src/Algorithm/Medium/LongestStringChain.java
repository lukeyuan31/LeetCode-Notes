package Algorithm.Medium;
import java.util.*;

public class LongestStringChain {
    public int longestStrChain(String[] words) {
        Map<String,Integer> map=new HashMap<String, Integer>();

        if (words.length==0){
            return 0;
        }

        Arrays.sort(words,(a,b)->a.length()-b.length());
        int result=0;
        for (String word: words){
            int best=1;
            for (int i=0;i<word.length();i++){
                String previous=word.substring(0,i)+word.substring(i+1);
                if (map.containsKey(previous)){
                    best=Math.max(map.get(previous)+1,best);
                }
            }
            map.put(word,best);
            result=Math.max(result,best);
        }
        return result;
    }
}
