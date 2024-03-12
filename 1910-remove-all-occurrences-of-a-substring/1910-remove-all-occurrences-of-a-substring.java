class Solution {
    public String removeOccurrences(String s, String part) {
        int index = s.indexOf(part);
        if(index==-1)
            return s;
        return removeOccurrences(s.substring(0, index) + s.substring(index+part.length()), part);
    }
}