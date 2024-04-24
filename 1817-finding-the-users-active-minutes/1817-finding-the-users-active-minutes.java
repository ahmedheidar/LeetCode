class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] res = new int[k];
        Map<Integer, HashSet<Integer>> map = new HashMap<>();
        
        for(int[] log: logs){
            HashSet<Integer> set = map.getOrDefault(log[0], new HashSet<Integer>());
            set.add(log[1]);
            map.put(log[0], set);
        }
        
        for(Map.Entry<Integer, HashSet<Integer>> entry: map.entrySet()){
            int uam = entry.getValue().size();
            if(uam <= k){
                res[uam-1]++;
            }
        }
        
        return res;
    }
}