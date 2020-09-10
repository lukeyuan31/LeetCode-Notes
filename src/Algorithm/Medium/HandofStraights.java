class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        int length=hand.length;
        if(length%W!=0){
            return false;
        }
        if(W==1){
            return true;
        }
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(hand);
        for(int i=0;i<length;i++){
            list.add(hand[i]);
        }
        
        int counter=0;
        int min;
        int temp=0;
        while(list.size()>0){
            if(counter==0){
                min=list.get(0);
                list.remove(0);
                temp=min;
                counter++;
            }else{
                temp++;
                if(!list.contains(temp)){
                    return false;
                }else{
                    list.remove(list.indexOf(temp));
                    counter++;
                    if(counter==W){
                        counter=0;
                    }
                }
            }
        }
        return true;
    }
}
