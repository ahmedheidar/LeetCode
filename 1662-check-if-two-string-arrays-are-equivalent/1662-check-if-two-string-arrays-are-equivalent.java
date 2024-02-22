class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        
        for(String string: word1){
            w1.append(string);
        }
        for(String string: word2){
            w2.append(string);
        }
        

        return w1.toString().equals(w2.toString());
    }
}