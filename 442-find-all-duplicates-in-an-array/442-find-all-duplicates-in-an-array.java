class Solution {
    public List<Integer> findDuplicates(int[] nums) {
                   List<Integer> res = new ArrayList<>();
        HashMap<Integer,Boolean> seen = new HashMap<>();
        for (int x:nums) {
            if(seen.containsKey(x)){
                res.add(x);
            }else{
                seen.put(x,true);
            }
        }
        return res;


    }
}