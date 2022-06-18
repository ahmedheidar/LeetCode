class Solution {
    public int removeElement(int[] nums, int val) {{
                int k= 0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==val){
                if(i< nums.length-1){
                    if(nums[i+1]!=val){
                        int tmp = nums[i];
                        nums[i]=nums[i+1];
                        nums[i+1]=tmp;
                    }else{
                        int j=i;
                        while(j<nums.length-1 && nums[j]==val){
                            j++;
                        }
                        int tmp = nums[i];
                        nums[i]=nums[j];
                        nums[j]=tmp;
                    }
                }
            }
            i++;
        }
        for (int j = nums.length-1; j >-1 ; j--) {
            if (nums[j]==val){
                k--;
            }
        }
        return k+ nums.length;

    }
    }
}