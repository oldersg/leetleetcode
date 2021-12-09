import java.util.Arrays;

public class ThreeSumCloest {
    public static void main(String[] args) {
        int a = new Solution().threeSumClosest(new int[]{-1,2,1,-4},1);
        System.out.println(a);
    }

    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int ans = nums[0]+nums[1]+nums[2];
            for (int i = 0; i < nums.length; i++) {
                int l = i+1;
                int r = nums.length-1;
                while (l<r)
                {
                    int sum = nums[i]+nums[l]+nums[r];
                    if(Math.abs(target-ans)>Math.abs(target-sum))
                        ans = sum;
                    if(sum<target)
                        l++;
                    else if(sum>target)
                        r--;
                    else
                        return sum;
                }
            }
            return ans;
        }
    }
}
