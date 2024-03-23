import java.util.UUID;

class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        HashMap<Character, String> keys = new HashMap();
        HashMap<String, TreeSet<Character>> map = new HashMap();
        
        for(int i = 0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(!keys.containsKey(c1) && !keys.containsKey(c2)){
                String key = UUID.randomUUID().toString();
                keys.put(c1, key);
                TreeSet<Character> set = new TreeSet();
                set.add(c1);
                if(c1!=c2){
                    set.add(c2);
                    keys.put(c2, key);
                }
                map.put(key, set);
            }else{
                if(keys.containsKey(c1)){
                    String key = keys.get(c1);
                    TreeSet<Character> set = map.get(key);
                    set.add(c2);
                    if(keys.containsKey(c2)){
                        set.addAll(map.get(keys.get(c2)));
                        TreeSet<Character> old = map.get(keys.get(c2));
                        for(char c:old){
                            keys.put(c, key);
                        }
                    }else{
                        keys.put(c2, key);
                    }
                }else if(keys.containsKey(c2)){
                    String key = keys.get(c2);
                    TreeSet<Character> set = map.get(key);
                    set.add(c1);
                    if(keys.containsKey(c1)){
                        set.addAll(map.get(keys.get(c1)));
                        TreeSet<Character> old = map.get(keys.get(c1));
                        for(char c:old){
                            keys.put(c, key);
                        }
                    }else{
                        keys.put(c1, key);
                    }
                }
            }
        }

        

        StringBuilder res = new StringBuilder();
        
        for(char c: baseStr.toCharArray()){
            if(!keys.containsKey(c)){
                res.append(c);
                continue;
            }
            String key = keys.get(c);
            char value = map.get(key).first();
            res.append(value);
        }
        
        return res.toString();
    }
}