class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        int max = -1;
        String res = "";
        for(int i=0; i< messages.length; i++){
            int words = messages[i].split(" ").length;
            map.put(senders[i], map.getOrDefault(senders[i], 0)+ words);
            int c = map.get(senders[i]);
            if(c>max){
                res = senders[i];
                max = c;
            }
            else if(c==max){
                if(senders[i].compareTo(res)>0)
                    res = senders[i];
            }
        }
        
        return res;
    }
}