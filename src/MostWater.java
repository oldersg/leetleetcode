import java.util.Arrays;

public class MostWater {
    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[]{4,3,2,1,4}));
    }
    static class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length-1;
            int res = 0;
            while (left<right)
            {
                int a = height[left];
                int b = height[right];
                int min = Math.min(a, b);
                res = Math.max((right-left)*min,res);
                if(a>b)
                    right--;
                else
                    left++;
            }
            return res;
        }
    }
}
