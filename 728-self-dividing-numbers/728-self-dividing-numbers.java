class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (selfDividing(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean selfDividing(int i) {
        int tmp = i;
        while (tmp > 0) {
            int d = tmp % 10;
            if (d == 0 || i % d != 0) {
                return false;
            }
            tmp = tmp / 10;
        }
        return true;
    }
}