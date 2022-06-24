class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] list = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            list[nums[i]] = 1;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (list[i] != 1) {
                res.add(i);
            }
        }

        return res;    
    }
}