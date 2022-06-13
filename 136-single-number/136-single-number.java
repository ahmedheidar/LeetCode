class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        int res = 0;
        for (int num : nums) {
            if (numbers.get(num) == null) {
                numbers.put(num, 0);
            } else {
                numbers.remove(num);
            }
        }
        Object[] key = numbers.keySet().toArray();

        return (int) key[0];
    }
}