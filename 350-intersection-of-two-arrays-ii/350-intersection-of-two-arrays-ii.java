class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
                HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int x:nums1) {
            if(hm.containsKey(x)){
                hm.replace(x,hm.get(x)+1);
            }else{
                hm.put(x,1);
            }
        }
        for (int x:nums2) {
            if(hm.containsKey(x)){
                res.add(x);
                hm.replace(x,hm.get(x)-1);
                if(hm.get(x)==0){
                    hm.remove(x);
                }
            }
        }
        return res.stream().mapToInt(x -> x).toArray();

    }
}