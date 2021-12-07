import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2,7,11,15},9)));
    }
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int anthor = target - nums[i];
                if(hashMap.containsKey(anthor))
                {
                    return new int[]{hashMap.get(anthor),i};
                }
                hashMap.put(nums[i],i);
            }
            return null;
        }
    }
}

