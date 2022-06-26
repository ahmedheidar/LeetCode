class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int[] arr:nums) {
            for (int x:arr) {
                if(count.containsKey(x)){
                    count.replace(x, count.get(x)+1);
                }else{
                    count.put(x,1);
                }
            }
        }
        System.out.println(count.toString());
        for (int i:count.keySet()) {
            if(count.get(i)==nums.length){
                res.add(i);
            }
        }
        Collections.sort(res);
        return res;

    }
}