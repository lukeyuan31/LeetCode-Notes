package Algorithm.Easy;

public class VerifyingonAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int[] newOrder=new int[26];
        for(int i=0;i<order.length();i++){
            newOrder[order.charAt(i)-'a']=i;
        }

        for(int i=0;i<words.length-1;i++){
            String word1=words[i];
            String word2=words[i+1];

            int min=Math.min(word1.length(),word2.length());

            for (int j=0;j<=min;j++){
                if (j==min){
                    if(word1.length()>word2.length()){
                        return false;
                    }
                    break;
                }
                if(word1.charAt(j)!=word2.charAt(j)){
                    char tempChar1=word1.charAt(j);
                    char tempChar2=word2.charAt(j);

                    if(newOrder[tempChar1-'a']>newOrder[tempChar2-'a']){
                        return false;
                    }
                    break;
                }
            }
        }

        return true;
    }
}
