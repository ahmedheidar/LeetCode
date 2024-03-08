import java.math.BigInteger;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> heap = new PriorityQueue<>((a, b) -> b.length()==a.length()?b.compareTo(a): b.length()-a.length());
        for (String num : nums) {
            heap.add(num);
            if(heap.size()>nums.length-k+1)
                heap.poll();
        }

        return heap.peek().toString();
    }
}