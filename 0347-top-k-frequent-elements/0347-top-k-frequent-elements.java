class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    TreeSet<Integer> set = new TreeSet<>((s1, s2)-> {
        int c1 = map.get(s1);
        int c2 = map.get(s2);
        if (c1 != c2) {
            return Integer.compare(c2, c1);
        } else {
            return Integer.compare(s1, s2);
        }
    });
    
    public int[] topKFrequent(int[] nums, int k) {
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        set.addAll(map.keySet());
        int[] intArray = set.stream().limit(k).mapToInt(Integer::intValue).toArray();
        return intArray;
    }
}