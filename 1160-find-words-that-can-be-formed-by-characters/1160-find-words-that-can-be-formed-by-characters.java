class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] map = new int[26];
        
        for(char c:chars.toCharArray()){
            map[c-'a']++;
        }
        
        int res = 0;
        for(String word: words){
            int[] table = Arrays.copyOf(map, map.length);
            boolean valid = true;
            for(char c: word.toCharArray()){
                if(table[c - 'a']==0){
                    valid = false;
                    break;
                }
                else{
                   table[c - 'a']--; 
                }
            }
            
            if(valid)
                res += word.length();
        }
        
        return res;
    }
}