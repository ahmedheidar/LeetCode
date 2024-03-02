class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> vowels = new HashSet<>(Set.of('a','e','i','o','u','A','E','I','O','U'));
        int h = s.length()/2;
        int c1 = 0;
        int c2 = 0;
        for(int i=0; i<s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                if(i<h)
                    c1++;
                else
                    c2++;
            }
        }
        
        return c1==c2;
    }
}