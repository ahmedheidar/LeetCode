class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap();
        HashMap<Character, Integer> tmap = new HashMap();
        
        for(int i=0; i<s.length(); i++){
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        int res = 0;
        for(char c : tmap.keySet()){
            int tc = tmap.get(c);
            int sc = smap.getOrDefault(c, 0);
            int diff =  (tc-sc);
            if(tc>sc)
                res += diff;
        }
        
        return res;
    }
}