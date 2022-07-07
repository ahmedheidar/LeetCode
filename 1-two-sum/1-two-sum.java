class Solution {
    public int[] twoSum(int[] nums, int target) {
                int[] res = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        int diff;
        for (int i = 0; i < nums.length ; i++) {
            if(hm.containsKey(nums[i])){
                res[0] = hm.get(nums[i]);
                res[1] = i;
                break;
            }
            diff = target-nums[i];
            hm.put(diff,i);
        }
        return res;


    }
}