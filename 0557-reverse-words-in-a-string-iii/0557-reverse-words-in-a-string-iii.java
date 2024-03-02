class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        
        for(String word: words){
            StringBuilder w = new StringBuilder(word);
            
            sb.append(w.reverse());
            sb.append(' ');
        }
        
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
    }
}