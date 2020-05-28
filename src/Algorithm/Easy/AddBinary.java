package Algorithm.Easy;

public class AddBinary {
    class Solution {
        public String addBinary(String a, String b) {
            int pointer1=a.length()-1;
            int pointer2=b.length()-1;
            int carry=0;
            StringBuffer result=new StringBuffer("");

            while(pointer1>=0 || pointer2>=0){
                if (pointer1<0){
                    for(int i=pointer2;i>=0;i--){
                        int tempsum1=Integer.parseInt(String.valueOf(b.charAt(i)))+carry;
                        if(tempsum1>=2){
                            result.append(tempsum1-2);
                            carry=1;
                        }else{
                            result.append(tempsum1);
                            carry=0;
                        }
                    }
                    pointer2=-1;
                }
                else if (pointer2<0){
                    for (int i=pointer1;i>=0;i--){
                        int tempsum2=Integer.parseInt(String.valueOf(a.charAt(i)))+carry;
                        if(tempsum2>=2){
                            result.append(tempsum2-2);
                            carry=1;
                        }else{
                            result.append(tempsum2);
                            carry=0;
                        }
                    }
                    pointer1=-1;
                }
                else {
                    int temp1=Integer.parseInt(String.valueOf(a.charAt(pointer1)));
                    int temp2=Integer.parseInt(String.valueOf(b.charAt(pointer2)));
                    int sum=temp1+temp2+carry;

                    if (sum>=2){
                        result.append(sum%2);
                        carry=1;
                    }else {
                        result.append(sum);
                        carry=0;
                    }
                    pointer1--;
                    pointer2--;
                }
            }

            if (carry>0){
                result.append(carry);
            }

            result.reverse();

            return result.toString();
        }
    }
}
