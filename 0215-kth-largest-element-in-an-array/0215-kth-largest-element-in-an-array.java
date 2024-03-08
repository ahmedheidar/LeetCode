class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)-> b.compareTo(a));
        for(int num: nums){
            pq.add(num);
        }
        
        while(!pq.isEmpty()){
            k--;
            int n = pq.poll();
            if(k==0){
                return n;
            }
        }
        
        return 0;
    }
}