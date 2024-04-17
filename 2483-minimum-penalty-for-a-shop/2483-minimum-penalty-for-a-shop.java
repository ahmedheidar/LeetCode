class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] prefixNoCustomers = new int[n + 1];
        int[] suffixCustomers = new int[n + 1];

        // Calculate prefixNoCustomers array
        for (int i = 1; i <= n; i++) {
            prefixNoCustomers[i] = prefixNoCustomers[i - 1] + (customers.charAt(i - 1) == 'N' ? 1 : 0);
        }

        // Calculate suffixCustomers array
        for (int i = n - 1; i >= 0; i--) {
            suffixCustomers[i] = suffixCustomers[i + 1] + (customers.charAt(i) == 'Y' ? 1 : 0);
        }

        int minPenalty = Integer.MAX_VALUE;
        int bestClosingTime = 0;

        // Calculate penalty for each closing time j
        for (int j = 0; j <= n; j++) {
            int penalty = prefixNoCustomers[j] + suffixCustomers[j];
            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestClosingTime = j;
            }
        }

        return bestClosingTime;
    }
}