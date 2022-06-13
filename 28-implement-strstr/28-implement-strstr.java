class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        int needleLength = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i)==needle.charAt(0)){
                if(needleLength+i>haystack.length()){
                    return -1;
                }
                String s = haystack.substring(i,i+needleLength);
                if (s.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}