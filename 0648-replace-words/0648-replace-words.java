class Solution {
static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        String word = null;
    }

    private void insert(TrieNode root, String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node = node.children.computeIfAbsent(ch, k -> new TrieNode());
        }
        node.word = word;
    }

    private String findRoot(TrieNode root, String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (node.children.containsKey(ch)) {
                node = node.children.get(ch);
                if (node.word != null) {
                    return node.word; 
                }
            } else {
                break;
            }
        }
        return word; 
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode root = new TrieNode();
        
        for (String rootWord : dictionary) {
            insert(root, rootWord);
        }

        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (result.length() > 0) {
                result.append(' ');
            }
            result.append(findRoot(root, word));
        }
        
        return result.toString();
    }
}