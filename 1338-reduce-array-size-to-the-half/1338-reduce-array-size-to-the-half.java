class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        Set<Integer> set = new HashSet<>();
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(map.values());

        int count = 0, removed = 0;
        while (!maxHeap.isEmpty() && removed < arr.length / 2) {
            removed += maxHeap.poll();
            count++;
        }

        return count;
    }
}