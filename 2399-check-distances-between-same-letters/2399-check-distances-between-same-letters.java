class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character, Integer> indexMap = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!indexMap.containsKey(c)) {
                indexMap.put(c, i);
            } else {
                int prevIndex = indexMap.get(c);
                int diff = i - prevIndex - 1;
                int letterIndex = c - 'a';
                if (distance[letterIndex] != diff) {
                    return false;
                }
            }
        }

        return true;
    }
}