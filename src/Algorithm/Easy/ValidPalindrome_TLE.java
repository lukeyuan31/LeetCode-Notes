package Algorithm.Easy;

public class ValidPalindrome_TLE {
    public boolean validPalindrome(String s) {
        int length=s.length();
        boolean temp=false;
        for (int i =0;i<=length-1;i++){
            temp=isPalindrome(s,i);
            if (temp==true){
                return false;
            }
        }
        return temp;
        //return true;
    }

    public boolean isPalindrome(String s, int index){
        int left=0;
        int right=s.length()-1;
        while (left<right){
            if (left==index){
                left++;
            }
            if (right==index){
                right--;
            }
            if (s.charAt(left)!=s.charAt(right)){
                break;
            }
            left++;
            right--;
        }
        if (left>=right){
            return true;
        }else {
            return false;
        }
        //return true;
    }
}
