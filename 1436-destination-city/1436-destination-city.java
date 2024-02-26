class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for(List<String> path: paths){
            map.put(path.get(0), path.get(1));
        }
        
        String start = paths.get(0).get(0);
        String target = map.get(start);
        while(map.get(target)!=null)
            target = map.get(target);
        return target;
    }
}