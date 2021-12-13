public class SearchInRotated {
    public static void main(String[] args) {

    }
    static class Solution {
        public int search(int[] nums, int target) {
            int n = nums.length;
            if(n==0)
                return -1;
            if(n==1)
                return n==nums[0]?0:-1;
            int l=0;
            int r=n-1;
            while (l<=r)
            {
                int mid=(l+r)/2;
                if(nums[mid]==target)
                    return mid;
                if(nums[mid]>=nums[0])
                {
                    if(nums[0]<=target&&target<nums[mid])
                        r=mid-1;
                    else
                        l=mid+1;
                }
                else
                {
                    if(nums[mid]<target&&target<=nums[n-1]){
                        l = mid+1;
                    }
                    else
                        r = mid-1;
                }

            }
            return -1;
        }
    }
}
