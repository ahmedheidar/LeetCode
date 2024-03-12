class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet();
        int res = 0;
        for(String word:words){
            String rev = new StringBuilder(word).reverse().toString();
            if(set.contains(word)){
                res++;
                set.remove(rev);
            }else{
                set.add(rev);
            }
                
        }
        return res;
    }
}