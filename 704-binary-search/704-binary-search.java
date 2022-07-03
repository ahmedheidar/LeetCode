class Solution {
    public int search(int[] nums, int target) {
        int res = Arrays.binarySearch(nums, target);
        if (res < 0) {
            return -1;
        }else {
            return res;
        }
    }
}