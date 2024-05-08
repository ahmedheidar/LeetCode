class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        
        for(List<String> pair: knowledge){
            map.put(pair.get(0), pair.get(1));
        }
        
        StringBuilder sb = new StringBuilder();
        String key = "";
        boolean read = false;
        for(char c: s.toCharArray()){
            if(c=='('){
                read = true;
                continue;
            }
            if(c==')'){
                read = false;
                sb.append(map.getOrDefault(key, "?"));
                key = "";
                continue;
            }
            
            if(read)
                key += c+"";
            else
                sb.append(c);
                
        }
        
        return sb.toString();
    }
}