class Solution {
    public String longestCommonPrefix(String[] strs) {
               if(strs.length==1){
            return strs[0];
        }
        int c = 0;
        int i=0;
        for (; i < strs.length-1; i++) {
            if(!(c<strs[i].length() && c<strs[i+1].length())){
                break;
            }
            if(strs[i].charAt(c)!=strs[i+1].charAt(c)){
                break;
            }
            if(i==strs.length-2){
                c++;
                i=-1;
            }
        }
        return strs[0].substring(0,c);

    }
}