class Solution {
    public boolean detectCapitalUse(String word) {
        boolean upper = true;
        boolean lower = true;
        int len = word.length();
        int u = 0;
        int l = 0;
        for(char c: word.toCharArray()){
            if(c>90)
                l++;              
            else
                u++;   
        }
        
        if(u==1)
            return word.charAt(0) < 97;

        if(u==len)
            return upper;
        if(l==len)
            return lower;
        return false;

    }
}