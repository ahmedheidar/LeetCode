class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    TreeSet<String> set = new TreeSet<>((s1, s2)-> {
        int c1 = map.get(s1);
        int c2 = map.get(s2);
        
        if (c1 == c2) {
            return s1.compareTo(s2);
        }

        return Integer.compare(c2, c1);
    });

    public List<String> topKFrequent(String[] words, int k) {
        for(String s: words){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        set.addAll(map.keySet());
        List<String> list = new ArrayList<>(set);
        return list.subList(0, k);
    }
}