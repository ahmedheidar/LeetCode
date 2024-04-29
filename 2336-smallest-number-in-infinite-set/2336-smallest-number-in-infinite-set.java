class SmallestInfiniteSet {
    
    private PriorityQueue<Integer> pq;
    private Set<Integer> pqset;
    private int c;
    public SmallestInfiniteSet() {
        pq  = new PriorityQueue<>(Comparator.naturalOrder());
        pqset = new HashSet<>();
        c=1;
    }
    
    public int popSmallest() {
        if(pq.isEmpty() || c<pq.peek()){
            return c++;
        }else{
            if(c==pq.peek())
                c++;
            pqset.remove(pq.peek());
            return pq.poll();
        }
        
    }
    
    public void addBack(int num) {
        if (!pqset.contains(num)) {
            pq.add(num);
            pqset.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */