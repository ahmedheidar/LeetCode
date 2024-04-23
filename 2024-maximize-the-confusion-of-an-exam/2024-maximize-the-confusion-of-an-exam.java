class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int left = 0;
        int maxLen = 0;
        int maxCount = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char currChar = answerKey.charAt(right);
            charCount.put(currChar, charCount.getOrDefault(currChar, 0) + 1);
            maxCount = Math.max(maxCount, charCount.get(currChar));

            while (right - left + 1 - maxCount > k) {
                char leftChar = answerKey.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}