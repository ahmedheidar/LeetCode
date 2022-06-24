class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        HashMap<Integer,Boolean> seen = new HashMap<>();
        for (int x:nums1) {
            if(!seen.containsKey(x)){
                seen.put(x,true);
            }
        }

        for (int x:nums2) {
            if(!seen.containsKey(x)){
                if(!l2.contains(x))
                    l2.add(x);
            }else{
                seen.replace(x,false);
            }
        }

        for (int x: seen.keySet()) {
            if(seen.get(x)){
                l1.add(x);
            }
        }
        res.add(l1);
        res.add(l2);
        return res;

    }
}