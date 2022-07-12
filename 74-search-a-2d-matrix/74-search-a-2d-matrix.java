class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] arr:matrix) {
            if(Arrays.binarySearch(arr,target)>-1){
                return true;
            }
        }
        return false;

    }
}