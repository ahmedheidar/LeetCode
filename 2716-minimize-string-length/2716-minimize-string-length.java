class Solution {
    public int minimizedStringLength(String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet();
        sb.append(s.charAt(0));
        int i = 0;
        while(i<s.length()){
            set.add(s.charAt(i));
            if(sb.charAt(sb.length()-1)!=s.charAt(i))
                sb.append(s.charAt(i));
            i++;
        }
        
        return set.size();
    }
}