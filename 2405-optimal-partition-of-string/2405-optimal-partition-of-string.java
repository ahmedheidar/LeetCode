class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int res = 1;
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                set.clear();
                set.add(c);
                res++;
                continue;
            }
            set.add(c);
        }
        
        return res;
    }
}