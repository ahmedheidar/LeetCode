class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap();
        
        for(char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        
        int curr = -1;
        for(char c: map.keySet()){
            int n = map.get(c);
            if(curr==-1){
                curr = n;
                continue;                
            }
            
            if(n!=curr)
                return false;
        }
        
        return true;
    }
}