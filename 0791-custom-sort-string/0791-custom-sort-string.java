class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<order.length(); i++){
            map.put(order.charAt(i), i);
        }
        
        char[] res = s.toCharArray();
        
        Character[] characters = new Character[res.length];
        for (int i = 0; i < res.length; i++) {
            characters[i] = res[i];
        }
        
        Arrays.sort(characters, new Comparator<Character>(){
            public int compare(Character a, Character b){
                return Integer.compare(map.getOrDefault(a, order.length()), map.getOrDefault(b, order.length()));
            }
        });
            
        StringBuilder result = new StringBuilder(characters.length);
        for (Character character : characters) {
            result.append(character);
        }
        
        return result.toString();        
    }
}