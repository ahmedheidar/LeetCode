import java.util.LinkedList;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        LinkedList<Integer> pos = new LinkedList<>();
        LinkedList<Integer> neg = new LinkedList<>();
        
        for(int n: nums){
            if(n<0)
                neg.add(n);
            else
                pos.add(n);
        }
        
        int[] arr = new int[nums.length];
        
        for(int i=0; i<arr.length; i++){
            arr[i++] = pos.remove();
            arr[i] = neg.remove();
        }
        
        return arr;
    }
}
