class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        int index = sb.indexOf(String.valueOf(ch));
        if(index==-1)
            return word;
        String rev = new StringBuilder(sb.substring(0, index+1)).reverse().toString();
        sb.replace(0, index+1, rev);
        return sb.toString();
    }
}