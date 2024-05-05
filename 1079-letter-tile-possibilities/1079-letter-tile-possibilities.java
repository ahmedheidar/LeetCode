class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        backtrack(tiles.toCharArray(), new boolean[tiles.length()], "", set);
        return set.size();
    }

    private void backtrack(char[] tiles, boolean[] used, String current, Set<String> set) {
        if (!current.isEmpty()) {
            set.add(current); 
        }
        
        for (int i = 0; i < tiles.length; i++) {
            if (!used[i]) {
                used[i] = true; 
                backtrack(tiles, used, current + tiles[i], set);
                used[i] = false; 
            }
        }
    }
    
}