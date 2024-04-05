class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        while (i < s.length()) {
            // Check if we have a potential two-digit number followed by '#'
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                // Get the two-digit number
                int num = Integer.parseInt(s.substring(i, i + 2));
                // Map to corresponding character ('j' to 'z')
                result.append((char) ('j' + num - 10));
                // Move the index by 3 since we consumed three characters (two digits + '#')
                i += 3;
            } else {
                // Single digit case ('a' to 'i')
                int num = Integer.parseInt(s.substring(i, i + 1));
                // Map to corresponding character ('a' to 'i')
                result.append((char) ('a' + num - 1));
                // Move the index by 1 since we consumed one character (single digit)
                i++;
            }
        }
        
        return result.toString();

    }
}