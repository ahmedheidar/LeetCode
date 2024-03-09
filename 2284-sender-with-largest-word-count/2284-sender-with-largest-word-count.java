class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i< messages.length; i++){
            String[] words = messages[i].split(" ");
            map.put(senders[i], map.getOrDefault(senders[i], 0)+ words.length);
        }
        
        TreeSet<String> ts = new TreeSet<>((a, b) -> {
            int countA = map.get(a);
            int countB = map.get(b);
            if(countA!=countB)
                return Integer.compare(countB, countA);
            return b.compareTo(a);
        });

        ts.addAll(map.keySet());

        System.out.print(ts);
        return ts.first();
    }
}