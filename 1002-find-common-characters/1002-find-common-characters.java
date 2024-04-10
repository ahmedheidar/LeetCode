class Solution {
    public List<String> commonChars(String[] words) {
        
        // Initialize a map to keep track of character frequencies across all words
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Process the first word to populate the initial character count map
        for (char ch : words[0].toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        // Iterate through the remaining words and update the character count map accordingly
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentMap = new HashMap<>();
            
            // Count characters in the current word
            for (char ch : words[i].toCharArray()) {
                if (charCountMap.containsKey(ch)) {
                    currentMap.put(ch, Math.min(currentMap.getOrDefault(ch, 0) + 1, charCountMap.get(ch)));
                }
            }
            
            // Update charCountMap to only include characters that appear in both the current word and previous words
            charCountMap = currentMap;
        }
        
        // Convert the final character count map to a list of characters
        List<String> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result.add(String.valueOf(ch));
            }
        }
        
        return result;
    }
}