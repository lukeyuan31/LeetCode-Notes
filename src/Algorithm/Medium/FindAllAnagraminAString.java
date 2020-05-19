package Algorithm.Medium;
import java.util.*;
public class FindAllAnagraminAString {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList result=new ArrayList();
        if(s.length()<p.length()){
            return result;
        }
        int length=p.length();
        char[] pchar=p.toCharArray();
        Arrays.sort(pchar);
        char[] tempChar={};
        for(int i=0;i<=s.length()-length;i++){
            String sub=s.substring(i,i+length);
            tempChar=sub.toCharArray();
            Arrays.sort(tempChar);
            if (Arrays.equals(pchar,tempChar)){
                result.add(i);
            }
        }

        return result;
    }
}
