class Solution {
    public String makeGood(String s) {
         StringBuilder sb = new StringBuilder(s);

        // Iterate over the string to check and remove bad pairs
        int i = 0;
        while (i < sb.length() - 1) {
            if (isBadPair(sb.charAt(i), sb.charAt(i + 1))) {
                sb.delete(i, i + 2);
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }

        return sb.toString();
    }
    
        private boolean isBadPair(char a, char b) {
        return Math.abs(a - b) == 32; 
    }
}