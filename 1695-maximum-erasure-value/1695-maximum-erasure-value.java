class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>(); 
        int left = 0, right = 0, maxSum = 0, currentSum = 0;

        while (right < nums.length) {
            if (!set.contains(nums[right])) {
                currentSum += nums[right];
                set.add(nums[right]);
                maxSum = Math.max(maxSum, currentSum);
                right++;
            } else {
                currentSum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
        }

        return maxSum;
    }
}