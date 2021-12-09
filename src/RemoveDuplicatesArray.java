public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int a = new Solution().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(a);
    }
    //方法：快慢指针
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int fast = 1;
            int slow = 0;
            while (fast<nums.length)
            {
                if(nums[slow]==nums[fast])
                {
                    fast++;
                }
                else
                {
                    nums[++slow] = nums[fast++];
                }
            }
            return slow+1;//这里返回的是数组坐标所以要加1
        }
    }
}
