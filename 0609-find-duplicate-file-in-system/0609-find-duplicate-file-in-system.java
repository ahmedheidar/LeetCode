class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, HashSet<String>> map = new HashMap<>();
        
        for(String path: paths){
            String[] parts = path.split(" ");
            String p = parts[0];
            for(int i=1; i<parts.length; i++){
                String[] file = parts[i].split("\\.");
                String content = file[1].substring(4, file[1].length()-1);
                map.computeIfAbsent(content, k -> new HashSet<>()).add(p+"/"+file[0]+".txt");
            }
            
        }
        
        List<List<String>> res = new ArrayList<>();
        for(String key: map.keySet()){
            if(map.get(key).size()==1)
                continue;
            List<String> list = new ArrayList<>();
            for(String path: map.get(key))
                list.add(path);
            res.add(list);
        }
        return res;
    }
}