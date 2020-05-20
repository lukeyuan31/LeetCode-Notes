package Algorithm.Easy;

public class AddStrings {
    class Solution {
        public String addStrings(String num1, String num2) {
            int length1=num1.length();
            int length2=num2.length();
            int pointer1=length1-1;
            int pointer2=length2-1;

            StringBuffer stringBuffer=new StringBuffer();

            int carry=0;
            while(pointer1>=0 || pointer2>=0){
                if(pointer1<0){
                    for(int i=pointer2;i>=0;i--){
                        int tempsum1=Integer.parseInt(String.valueOf(num2.charAt(i)))+carry;
                        if(tempsum1>=10){
                            stringBuffer.append(tempsum1-10);
                            carry=1;
                        }else{
                            stringBuffer.append(tempsum1);
                            carry=0;
                        }
                    }
                    pointer2=-1;
                }
                else if (pointer2<0){
                    for (int i=pointer1;i>=0;i--){
                        int tempsum2=Integer.parseInt(String.valueOf(num1.charAt(i)))+carry;
                        if(tempsum2>=10){
                            stringBuffer.append(tempsum2-10);
                            carry=1;
                        }else{
                            stringBuffer.append(tempsum2);
                            carry=0;
                        }
                    }
                    pointer1=-1;
                }else {
                    int temp1= Integer.parseInt(String.valueOf(num1.charAt(pointer1)));
                    int temp2= Integer.parseInt(String.valueOf(num2.charAt(pointer2)));
                    int sum=temp1+temp2;
                    if (sum+carry>=10){
                        stringBuffer.append(sum-10+carry);
                        carry=1;
                    }
                    else {
                        stringBuffer.append(sum+carry);
                        carry=0;
                    }
                    pointer1--;
                    pointer2--;
                }
            }
            if (carry!=0){
                stringBuffer.append(carry);
            }
            stringBuffer.reverse();
            //System.out.println(stringBuffer.toString());
            return stringBuffer.toString();
        }
    }
}
