class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length+1];
        int largest = 0;
        int index = 0;
        for (int i = 0; i <nums.length ; i++) {
            arr[nums[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest = arr[i];
                index = i;
            }
        }
        return index;
    }
}