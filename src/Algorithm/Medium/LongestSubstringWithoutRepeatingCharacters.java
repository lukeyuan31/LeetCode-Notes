package Algorithm.Medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if(s.length()==0){
                return 0;
            }
            HashSet<String> letterSet=new HashSet<String>();
            //boolean status=false;
            int max=0;
            int length=s.length();
            int i=0;
            int j=0;
            //int temp=0;
            //String beacon=String.valueOf(s.charAt(0));
            //letterSet.add(beacon);
            while(i<length && j<length){
                if(!letterSet.contains(String.valueOf(s.charAt(j)))){
                    letterSet.add(String.valueOf(s.charAt(j++)));
                    max=Math.max(max,j-i);
                }
                else{
                    letterSet.remove(String.valueOf(s.charAt(i++)));
                }
            }
            return max;
        }
    }
}
