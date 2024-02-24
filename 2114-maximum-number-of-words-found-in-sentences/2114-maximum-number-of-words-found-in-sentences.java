class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = -1;
        for(String sentence: sentences){
            String[] words = sentence.split(" ");
            int n = words.length;
            max = Math.max(max, n);
        }
        
        return max;
    }
}