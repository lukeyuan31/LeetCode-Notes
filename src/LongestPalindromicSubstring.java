public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String temp;
        String tempReverse;
        int length=0;
        String result="";
        if(s.length()==0){
            return "";
        }
        for(int i=0;i<s.length();i++){
            for(int j=s.length();j>i;j--){
                temp=s.substring(i,j);

                if(isPalindrome(temp)==true && temp.length()>length){
                    result=temp;
                    length=temp.length();
                }
                if(length>=s.length()-i){
                    return result;
                }
            }
        }
        return result;
    }

    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
