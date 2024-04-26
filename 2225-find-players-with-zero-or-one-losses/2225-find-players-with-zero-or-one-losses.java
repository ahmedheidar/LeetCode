class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int[] match: matches){
            if(!map.containsKey(match[0]))
                map.put(match[0], 0);
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
        }
        
        Set<Integer> zero = new TreeSet<>();
        Set<Integer> one = new TreeSet<>();
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==0)
                zero.add(entry.getKey());
            else if(entry.getValue()==1)
                one.add(entry.getKey());
        }
        
        List<Integer> sortedZero = new ArrayList<>(zero);
        List<Integer> sortedOne = new ArrayList<>(one);
        
        List<List<Integer>> res = new ArrayList<>();
        
        res.add(sortedZero);
        res.add(sortedOne);
        
        return res;

    }
}