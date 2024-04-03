class Solution {
    public List<String> cellsInRange(String s) {
        String[] parts = s.split(":");
        String startCell = parts[0];
        String endCell = parts[1];

        int startRow = Integer.parseInt(startCell.substring(1));
        int endRow = Integer.parseInt(endCell.substring(1));

        char startCol = startCell.charAt(0);
        char endCol = endCell.charAt(0);

        List<String> cells = new ArrayList<>();

        for (char col = startCol; col <= endCol; col++) {
            for (int row = startRow; row <= endRow; row++) {
                cells.add("" + col + row);
            }
        }

        return cells;        
    }
}