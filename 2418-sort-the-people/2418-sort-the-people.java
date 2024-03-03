class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Person> heap = new PriorityQueue<>((a, b) -> b.getHeight()-a.getHeight());
        for(int i=0; i<names.length; i++){
            heap.offer(new Person(names[i], heights[i]));
        }
        
        String[] res = new String[names.length];
        for(int i=0; i< res.length; i++){
            res[i] = heap.poll().getName();
        }
        
        return res;
    }
}

class Person {
    private int height;
    private String name;
    
    public Person(String n, int h){
        height = h;
        name = n;
    }
    
    public int getHeight(){
        return height;
    }
    
    public String getName(){
        return name;
    }
}