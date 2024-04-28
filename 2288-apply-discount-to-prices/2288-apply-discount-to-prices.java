class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.startsWith("$") && word.length()>1 && word.matches("\\$\\d+(?!\\$)")) {
                String priceString = word.substring(1);
                double price = Double.parseDouble(priceString);
                double discountedPrice = price * (1 - (discount / 100.0));
                String formattedPrice = String.format("$%.2f", discountedPrice);
                result.append(formattedPrice).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}