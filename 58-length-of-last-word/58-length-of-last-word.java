class Solution {
    public int lengthOfLastWord(String s) {
        String word = s.trim();
        int i =word.length()-1;
        int length=0;
        while(i>-1 && word.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;
}
}