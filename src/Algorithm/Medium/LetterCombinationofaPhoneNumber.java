package Algorithm.Medium;

import java.util.List;
import java.util.ArrayList;

public class LetterCombinationofaPhoneNumber {
    class Solution {
        List<String> result = new ArrayList<String>();
        public List<String> letterCombinations(String digits) {
            if(digits.length()==0){
                return result;
            }
            Combination("", digits.length(),0, digits);
            return result;
        }
        public String getLetters(String number){
            switch (number){
                case "2": return "abc";
                case "3": return "def";
                case "4": return "ghi";
                case "5": return "jkl";
                case "6": return "mno";
                case "7": return "prqs";
                case "8": return "tuv";
                case "9": return "wxyz";
            }
            return "";
        }

        public void Combination(String current, int length,int pointer, String input){
            if(current.length()==length){
                result.add(current);
                return;
            }
            else{
                String cur_pointer=input.substring(pointer,pointer+1);
                String letters=getLetters(cur_pointer);
                for(int i=0;i<letters.length();i++){
                    String letter=letters.substring(i,i+1);
                    Combination(current+letter, length, pointer+1,input);
                }
            }


        }
    }
}
