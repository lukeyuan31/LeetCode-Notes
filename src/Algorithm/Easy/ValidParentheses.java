package Algorithm.Easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length()==0){
            return true;
        }
        else if(s.length()%2 == 1){
            return false;
        }
        else{
            Stack<Integer> st=new Stack<Integer>();
            int temp=0;
            for(int i=0;i<s.length();i++){
                switch(s.charAt(i)){
                    case '(':{
                        st.push(1);
                        break;
                    }
                    case '[':{
                        st.push(2);
                        break;
                    }
                    case '{':{
                        st.push(3);
                        break;
                    }
                    case ')':{
                        if(st.empty()==true){
                            return false;
                        }
                        temp=st.pop();
                        if (temp!=1){
                            return false;
                        }
                        break;
                    }
                    case ']':{
                        if(st.empty()==true){
                            return false;
                        }
                        temp=st.pop();
                        if (temp!=2){
                            return false;
                        }
                        break;
                    }
                    case '}':{
                        if(st.empty()==true){
                            return false;
                        }
                        temp=st.pop();
                        if (temp!=3){
                            return false;
                        }
                        break;
                    }

                }
            }
            if(st.empty()==true){
                return true;
            }else{
                return false;
            }
        }
    }
}
