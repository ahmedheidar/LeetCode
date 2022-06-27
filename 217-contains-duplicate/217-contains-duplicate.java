class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int x:nums) {
            if(count.get(x)!=null){
                return true;
            }else{
                count.put(x,1);
            }
        }
        return false;

    }
}