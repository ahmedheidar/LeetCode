class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        // Sort nums in descending order
        Arrays.sort(nums);
        reverse(nums);
        
        // Create a 2D array to store the result
        List<List<Integer>> result = new ArrayList<>();
        
        // Iterate through the sorted nums array
        for (int num : nums) {
            boolean placed = false;
            
            // Try to place the current num in an existing row
            for (List<Integer> row : result) {
                // If the num is not present in the current row
                if (!row.contains(num)) {
                    row.add(num);
                    placed = true;
                    break;
                }
            }
            
            // If the num couldn't be placed in any existing row, create a new row
            if (!placed) {
                List<Integer> newRow = new ArrayList<>();
                newRow.add(num);
                result.add(newRow);
            }
        }
        
        return result;
    }
    
        private void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        }
}