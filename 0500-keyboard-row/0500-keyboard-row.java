class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        
        for(String word: words){
            boolean valid = isValid(word.toLowerCase());
            if(valid)
                res.add(word);
        }
        
        return res.toArray(new String[0]);
    }
    
    private boolean isValid(String s){
        Set<Character> row1 = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        Set<Character> row2 = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        Set<Character> row3 = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');
        
        int type = row1.contains(s.charAt(0))? 1: row2.contains(s.charAt(0))? 2 : 3;
        
        for(char c: s.toCharArray()){
            if(type==1 && !row1.contains(c))
                return false;
            else if(type==2 && !row2.contains(c))
                return false;
            else if(type==3 && !row3.contains(c))
                return false;
        }
        
        return true;
    }
}