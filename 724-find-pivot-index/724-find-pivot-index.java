class Solution {
    public int pivotIndex(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
            int leftSum;
            int rightSum;
            if (i == 0) {
                leftSum = 0;
            }else{
                leftSum= getSum(Arrays.copyOfRange(nums,0,i));
            }
            if(i== nums.length-1){
                rightSum=0;
            }else{
                rightSum = getSum(Arrays.copyOfRange(nums, i + 1, nums.length));
            }
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;

    }
    
    public int getSum(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum = sum + n;
        }
        return sum;
    }
}