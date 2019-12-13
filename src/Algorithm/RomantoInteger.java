package Algorithm;

public class RomantoInteger<num> {
    public int romanToInt(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            int pointer = getValue(s.charAt(i));
            int child;
            if(i==(s.length()-1)){
                child=0;
            }else{
                child=getValue(s.charAt(i+1));
            }

            if(pointer>=child){
                result=result+pointer;
            }
            else if (pointer<child){
                result=result-pointer;
            }


        }
        return result;
    }

    public int getValue(char i){
        switch(i){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }

    }
}
