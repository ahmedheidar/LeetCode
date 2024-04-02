class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();
        int max = 0;

        for(char c: s.toCharArray()){
            if(sb.toString().contains(String.valueOf(c))){
                    int i = sb.indexOf(String.valueOf(c));
                    sb.delete(0, i+1);
            }
            sb.append(c);
            max = Math.max(max, sb.length());
        }
        
        return max;
    }
}