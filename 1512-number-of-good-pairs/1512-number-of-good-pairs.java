class Solution {
    public int numIdenticalPairs(int[] nums) {
                int count = 0;
        // We'll use a frequency array to count occurrences of each number
        int[] freq = new int[101]; // Since nums[i] is in range [1, 100] based on problem constraints

        // Count occurrences of each number in nums
        for (int num : nums) {
            freq[num]++;
        }

        // Calculate the number of good pairs
        for (int f : freq) {
            if (f > 1) {
                // If a number appears 'f' times, the number of good pairs formed by this number is f * (f - 1) / 2
                count += (f * (f - 1)) / 2;
            }
        }

        return count;
    }
}