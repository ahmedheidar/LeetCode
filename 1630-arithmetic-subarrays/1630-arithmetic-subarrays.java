class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        
        for (int i = 0; i < l.length; i++) {
            int left = l[i];
            int right = r[i];
            int[] subarray = Arrays.copyOfRange(nums, left, right + 1);
            Arrays.sort(subarray);
            result.add(isArithmetic(subarray));
        }
        
        return result;
    }
    
    private boolean isArithmetic(int[] arr) {
        if (arr.length <= 1) {
            return false;
        }
        
        int diff = arr[1] - arr[0];
        
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return false;
            }
        }
        
        return true;
    }
}