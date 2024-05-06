class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int num: nums){
            set.add(num);
            StringBuilder sb = new StringBuilder(Integer.toString(num)).reverse();
            set.add(Integer.parseInt(sb.toString()));
        }
        
        return set.size();
    }
}