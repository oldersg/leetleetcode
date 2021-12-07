import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> list = new Solution().threeSum(new int[]{});
        System.out.println(list);
    }
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            if(nums==null||nums.length<3)
                return ans;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]>0)
                    break;
                if(i>0&&nums[i]==nums[i-1])
                    continue;
                int l = i+1;
                int r = nums.length-1;
                while (l<r)
                {
                    int sum = nums[l]+nums[i]+nums[r];
                    if(sum==0)
                    {
                        ans.add(Arrays.asList(nums[l],nums[i],nums[r]));
                        while (l<r&&nums[l]==nums[l+1]) l++;
                        while (l<r&&nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                    }
                    else if(sum>0) r--;
                    else l++;
                }
            }
            return ans;
        }
    }
}
