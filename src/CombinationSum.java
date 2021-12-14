import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {

    }
    static class Solution {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            backtrack(candidates,0,target,0);
            return res;
        }
        private void backtrack(int[]candidates,int start,int target,int sum)
        {
            if(sum==target)
            {
                res.add(new LinkedList<>(track));
                return;
            }
            else if(sum>target)
            {
                return;
            }
            for (int i = start; i < candidates.length; i++) {
                track.add(candidates[i]);
                sum+=candidates[i];
                backtrack(candidates,i,target,sum);
                sum-=candidates[i];
                track.removeLast();
            }
        }
    }
}
