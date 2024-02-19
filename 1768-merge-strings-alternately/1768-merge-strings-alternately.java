class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int w1 = word1.length();
        int w2 = word2.length();
        int max = Math.max(w1, w2);
        for(int i = 0; i < max; i++){
            if(w1==0){
                res.append(word2.substring(i, word2.length()));
                break;
            }
            if(w2==0){
                res.append(word1.substring(i, word1.length()));
                break;
            }
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
            w1--;
            w2--;
        }
        return res.toString();
    }
}