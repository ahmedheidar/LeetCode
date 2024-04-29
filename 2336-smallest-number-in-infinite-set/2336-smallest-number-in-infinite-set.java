class SmallestInfiniteSet {
    
    private PriorityQueue<Integer> pq;

    private int c;
    public SmallestInfiniteSet() {
        pq  = new PriorityQueue<>(Comparator.naturalOrder());
        c=1;
    }
    
    public int popSmallest() {
        if(pq.isEmpty() || c<pq.peek()){
            return c++;
        }else{
            if(c==pq.peek())
                c++;
            return pq.poll();
        }
        
    }
    
    public void addBack(int num) {
        if (!pq.contains(num)) {
            pq.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */