package Algorithm;

public class LongestCommonPrefix {
    public int FindShortest(String[] strs){
        int index=0;
        for(int m=1;m<strs.length;m++){
            if(strs[m].length()<strs[index].length()){
                index=m;
            }
        }
        return index;

    }
    public String longestCommonPrefix(String[] strs) {
        String result="";
        int count=0;
        if(strs.length==0){
            return result;
        }
        int pointer=FindShortest(strs);
        for(int i=0;i<strs[pointer].length();i++){
            String temp=String.valueOf(strs[0].charAt(i));
            for(int j=0;j<strs.length;j++){
                if(String.valueOf(strs[j].charAt(i)).equals(temp)){
                    count++;
                }
                else{
                    return result;
                }
            }
            if(count==strs.length){
                result=result+temp;
            }
            count=0;
        }
        return result;
    }
}
