package Algorithm.Easy;
import java.util.*;

public class ValidAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==0){
            return new ArrayList();
        }
        Map<String, List> map=new HashMap<String,List>();
        for(int i=0;i<strs.length;i++){
            String tempStr=strs[i];
            char[] chars=tempStr.toCharArray();
            Arrays.sort(chars);
            tempStr=String.valueOf(chars);
            if(map.containsKey(tempStr)){
                map.get(tempStr).add(strs[i]);
            }else {
                map.put(tempStr,new ArrayList());
                map.get(tempStr).add(strs[i]);
            }
        }
        return new ArrayList(map.values());
    }
}
