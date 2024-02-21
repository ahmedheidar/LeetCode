class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> letters = new HashSet<>(Set.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

        
        for(char c: sentence.toCharArray()){
            if(letters.isEmpty())
                break;
            letters.remove(c);
        }
        
        return letters.isEmpty();
    }
}