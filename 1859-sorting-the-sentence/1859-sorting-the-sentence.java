class Solution {
    public String sortSentence(String s) {
        HashMap<Integer, String> wordsMap = new HashMap<>();
        String[] wordsArray = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word: wordsArray){
            StringBuilder sb = new StringBuilder(word);
            int key = Character.getNumericValue(sb.charAt(sb.length()-1));
            String value = sb.deleteCharAt(sb.length()-1).toString();
            wordsMap.put(key, value);
        }
        
        for(int i = 1; i <= wordsArray.length; i++){
            String w = wordsMap.get(i);
            res.append(w);
            res.append(" ");
        }
        
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}