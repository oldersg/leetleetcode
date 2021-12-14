import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Solution().searchRange(new int[]{5,7,7,10},8)));
    }
    //二分法第一注意边界，第二注意while是大等于，第三注意边界越界
    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            int r = nums.length;
            int[]ans = new int[]{-1,-1};
            if(r==0)
                return ans;

            int l = 0;
            while (l<r)
            {
                int mid = (r-l)/2+l;
                if(nums[mid]==target)
                {
                    r = mid;
                }
                else if(nums[mid]<target)
                {
                    l = mid+1;
                }
                else if(nums[mid]>target)
                {
                    r = mid;
                }
            }
            if(l== nums.length||nums[l]!=target)
                return ans;
            else
            {
                ans[0]=l;
            }

            l = 0;
            r = nums.length;
            while (l<r)
            {
                int mid = (r-l)/2+l;
                if(nums[mid]==target)
                {
                    l = mid+1;
                }
                else if(nums[mid]<target)
                {
                    l = mid+1;
                }
                else if(nums[mid]>target)
                {
                    r = mid;
                }
            }
            if(l==0||nums[l-1]!=target)
                return ans;
            else
            {
                ans[1] = l-1;
            }
            return ans;
        }
    }
}
