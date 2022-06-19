class Solution {
    public int pivotIndex(int[] nums) {
                    for (int i = 0; i < nums.length; i++) {
            int leftSum=0;
            int rightSum = 0;
            if (i == 0) {
                leftSum = 0;
            }else{
                for (int j = 0; j < i; j++) {
                    leftSum = leftSum+nums[j];
                }
            }
            if(i== nums.length-1){
                rightSum=0;
            }else{
                for (int j = i+1; j < nums.length; j++) {
                    rightSum=rightSum+nums[j];
                }
            }
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;

    }
}