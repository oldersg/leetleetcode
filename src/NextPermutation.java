import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {
        new Solution().nextPermutation(new int[]{1,2,3,8,5,7,6,4});
    }
    //[1,2,3,8,5,7,6,4] [1,2,3,8,6,4,5,7]
    static class Solution {
        public void nextPermutation(int[] nums) {
            int i = nums.length - 2;
            while (i >= 0 && nums[i] >= nums[i + 1]) {
                i--;
            }
            if (i >= 0) {
                int j = nums.length - 1;
                while (j >= 0 && nums[i] >= nums[j]) {
                    j--;
                }
                swap(nums, i, j);
            }
            reverse(nums, i + 1,nums.length-1);

            System.out.println(Arrays.toString(nums));
        }
        private void reverse(int[] nums, int i, int j) {
            while (i < j) {
                swap(nums, i++, j--);
            }
        }

        private void swap(int[] nums, int i, int i1) {
            int tmp = nums[i];
            nums[i] = nums[i1];
            nums[i1] = tmp;
        }
    }
}
