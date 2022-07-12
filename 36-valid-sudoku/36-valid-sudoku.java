class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (char[] row : board) {
            if (!NoDuplicate(row)) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            HashSet<Character> colSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (c != '.') {
                    if (colSet.contains(c)) {
                        return false;
                    } else {
                        colSet.add(c);
                    }
                }
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                HashSet<Character> boxSet = new HashSet<>();
                for (int m = i; m < i+3; m++) {
                    for (int n = j; n < j+3; n++) {
                        char c = board[m][n];
                        if (c != '.') {
                            if (boxSet.contains(c)) {
                                return false;
                            } else {
                                boxSet.add(c);
                            }
                        }
                    }
                }
            }
        }

        return true;


    }
    
        private boolean NoDuplicate(char[] arr) {
        HashSet<Character> set = new HashSet<>();
        for (char c : arr) {
            if (c != '.') {
                if (set.contains(c)) {
                    return false;
                } else {
                    set.add(c);
                }
            }
        }
        return true;
    }
}