class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(numbers.get(nums[i])==null){
                numbers.put(nums[i],0);
            }else{
                numbers.remove(nums[i]);
            }
        }
        for (int key:numbers.keySet()) {
            res = key;
        }
        return res;
    }
}