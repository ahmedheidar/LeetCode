class Solution {
    public int missingNumber(int[] nums) {
        int sumOfNums = 0;
        int sum = 0;
        for (int i = 0; i <nums.length+1 ; i++) {
            if(i<nums.length)
                sumOfNums+=nums[i];
            sum+=i;
        }
        return sum - sumOfNums;
    }
}