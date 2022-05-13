class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            for (int n = 0;n< nums1.length;n++) {
                for (int i = 0; i < nums2.length; i++) {
                    if(nums1[n]==nums2[i]){
                        boolean flag = false;
                        for (int j = i; j < nums2.length; j++) {
                            if(nums2[j]>nums1[n]){
                                nums1[n]=nums2[j];
                                flag=true;
                                break;
                            }
                        }
                        if(!flag){
                            nums1[n]=-1;
                        }
                        break;

                    }
                }
            }
            return nums1;
    }
}