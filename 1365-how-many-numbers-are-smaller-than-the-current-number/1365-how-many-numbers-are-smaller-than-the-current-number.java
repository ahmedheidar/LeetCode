class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        
        int[] ret = new int[len];
        int max = max(nums, len);
        int[] counter = new int[max+1];
        
        for(int i=0;i<len;i++) {
            counter[nums[i]]++;
        }
        
        for(int i=0;i<len;i++) {
            int count = 0;
            for (int j=nums[i]-1;j>=0;j--) {
                count += counter[j];
            }
            ret[i] = count;
        }
        return ret;
    }
    
    static int max(int nums[], int len) {
        int max = nums[0];
        
        for(int i=1;i<len;i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
}