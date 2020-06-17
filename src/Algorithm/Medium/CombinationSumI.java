package Algorithm.Medium;
import java.util.*;

public class CombinationSumI {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        //Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), target, 0, candidates);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> temp, int remain, int start,int[] candidates){
        if (remain<0){
            return;
        }
        else if (remain == 0) {
            result.add(new ArrayList<>(temp));
        }
        else {
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                backtrack(result,temp,remain-candidates[i],i,candidates);
                temp.remove(temp.size()-1);
            }
        }

    }
}
