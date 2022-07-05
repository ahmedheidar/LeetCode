class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int x:nums) {
            if(seen.contains(x)==false){
                seen.add(x);
            }else return true;
        }
        return false;
 
    }
}