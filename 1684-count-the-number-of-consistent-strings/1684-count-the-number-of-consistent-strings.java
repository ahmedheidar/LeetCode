class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int n = 0;
        for(char c: allowed.toCharArray()){
            set.add(c);
        }
        
        for(String s: words){
            boolean consistent = true;
            for(char c: s.toCharArray()){
                if(!set.contains(c)){
                    consistent = false;
                    break;
                }
            }

            if(consistent)
                n++;
        }
        
        return n;
    }
}