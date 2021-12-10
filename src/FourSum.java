import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        List<List<Integer>> list = new Solution().fourSum(new int[]{1,0,-1,0,-2,2},0);
        System.out.println(list);
    }
    static class Solution {
        public List<List<Integer>> fourSum(int[] nums,int target) {
            List<List<Integer>> ans = new ArrayList<>();
            if(nums==null||nums.length<4)
                return ans;
            Arrays.sort(nums);
            for (int j = 0; j < nums.length-3; j++) {
                if (j > 0 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if (nums[j] + nums[j + 1]  > target-(nums[j + 2] + nums[j + 3])) {
                    break;
                }
                if (nums[j] + nums[nums.length - 3] < target-(nums[nums.length  - 2] + nums[nums.length  - 1] )) {
                    continue;
                }
                for (int i = j+1; i < nums.length-2; i++) {
                    if(i>j+1&&nums[i]==nums[i-1])
                        continue;
                    if(nums[j]+nums[i]>target-(nums[i+1]+nums[i+2]))
                        break;
                    if (nums[i] + nums[nums.length - 3] < target-(nums[nums.length  - 2] + nums[nums.length  - 1] )) {
                        continue;
                    }
                    int l = i+1;
                    int r = nums.length-1;
                    while (l<r)
                    {
                        int sum = nums[l]+nums[r];
                        if(sum==(target-nums[i]-nums[j]))
                        {
                            ans.add(Arrays.asList(nums[j],nums[l],nums[i],nums[r]));
                            while (l<r&&nums[l]==nums[l+1]) l++;
                            while (l<r&&nums[r]==nums[r-1]) r--;
                            l++;
                            r--;
                        }
                        else if(sum>target-nums[i]-nums[j]) r--;
                        else l++;
                    }
                }
            }

            return ans;
        }
    }
}
