class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for(int n: nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        int moves = 0;
        
        for(int f: freq.values()){
            if(f==1)
                return -1;
            if(f==2){
                moves++;
                continue;
            }
            
            int q = f/3;
            moves+= f%3==0? q: q+1;
        }
        
        return moves;
    }
}