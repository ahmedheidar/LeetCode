class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, HashSet<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<groupSizes.length; i++){
            HashSet<Integer> set = map.getOrDefault(groupSizes[i], new HashSet<Integer>());
            set.add(i);
            if(set.size()==groupSizes[i]){
                res.add(new ArrayList<>(set));
                map.remove(groupSizes[i]);
            }else{
                map.put(groupSizes[i], set);
            }
        }
        
        return res;
    }
}