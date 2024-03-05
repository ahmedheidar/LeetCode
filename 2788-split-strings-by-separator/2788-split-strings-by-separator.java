class Solution {
        public List<String> splitWordsBySeparator(List<String> words, char separator) {
        return words.stream()
                .flatMap(word -> Arrays.stream(word.split(String.valueOf("\\"+separator))))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
    }
}