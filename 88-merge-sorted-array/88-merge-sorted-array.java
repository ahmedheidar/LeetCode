class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        if(n==0){
            return;
        }
        while(i<m){
            if(nums1[i]>nums2[j]){
                int tmp = nums1[i];
                nums1[i]=nums2[j];
                nums2[j] = tmp;
                Arrays.sort(nums2);
            }
            i++;
        }
        while(m<nums1.length){
            nums1[m]=nums2[j];
            m++;
            j++;
        }
        System.out.println(Arrays.toString(nums1));

    }
}