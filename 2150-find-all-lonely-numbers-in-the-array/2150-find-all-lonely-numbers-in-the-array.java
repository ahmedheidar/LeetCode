class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        List<Integer> res = new ArrayList<>();
        
        for(int n: nums){
            if(map.getOrDefault(n, 0)==1 && map.getOrDefault(n-1, 0)==0 && map.getOrDefault(n+1, 0)==0)
                res.add(n);
        }
        
        return res;
    }
}