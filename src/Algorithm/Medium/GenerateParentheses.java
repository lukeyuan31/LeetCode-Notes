class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList();
        generate(result,"",0,0,n);
        return result;
    }

    public void generate(List<String> result,String current, int left, int right, int length){
        if(current.length()==2*length){
            result.add(current);
            return;
        }
        if(length>left){
            generate(result,current+"(",left+1,right,length);
        }
        if(left>right){
            generate(result,current+")",left,right+1,length);
        }

    }
}

