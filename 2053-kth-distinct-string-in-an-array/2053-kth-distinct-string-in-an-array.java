class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> dis = new HashSet<>();
        Set<String> sim = new HashSet<>();
        
        for(String s: arr){
            if(dis.contains(s)){
                dis.remove(s);
                sim.add(s);
            }else{
                if(!sim.contains(s))
                    dis.add(s);
            }
        }
        
        
        if(k>dis.size())
            return "";
        
        for(String s: arr){
            if(dis.contains(s)){
                if(k==1)
                    return s;
                k--;
            }
        }
        
        return "Ahmed Gamed";
    }
}