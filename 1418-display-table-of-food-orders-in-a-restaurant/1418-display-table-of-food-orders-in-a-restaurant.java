class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Map<Integer, Map<String, Integer>> tableFoodCount = new TreeMap<>();

        Set<String> foodItems = new TreeSet<>();

        for (List<String> order : orders) {
            int tableNumber = Integer.parseInt(order.get(1));
            String foodItem = order.get(2);

            foodItems.add(foodItem);

            if (!tableFoodCount.containsKey(tableNumber)) {
                tableFoodCount.put(tableNumber, new HashMap<>());
            }
            Map<String, Integer> foodCount = tableFoodCount.get(tableNumber);
            foodCount.put(foodItem, foodCount.getOrDefault(foodItem, 0) + 1);
        }

        List<List<String>> displayTable = new ArrayList<>();
        List<String> header = new ArrayList<>();
        header.add("Table");
        header.addAll(foodItems);
        displayTable.add(header);

        for (Map.Entry<Integer, Map<String, Integer>> entry : tableFoodCount.entrySet()) {
            List<String> row = new ArrayList<>();
            row.add(String.valueOf(entry.getKey()));
            Map<String, Integer> foodCount = entry.getValue();
            for (String foodItem : foodItems) {
                row.add(String.valueOf(foodCount.getOrDefault(foodItem, 0)));
            }
            displayTable.add(row);
        }

        return displayTable;
    }
}