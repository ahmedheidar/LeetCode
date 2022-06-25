class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Boolean> seen = new HashMap<>();
        for (int x:nums) {
            if(seen.get(x)==null){
                seen.put(x,true);
            }else{
                res.add(x);
            }
        }
        return res;


    }
}