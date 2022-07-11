class Solution {
    public List<List<Integer>> generate(int numRows) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        for (int i = 1; i <= numRows; i++) {
            LinkedList<Integer> currlist = new LinkedList<>();
            if(i==1){
                currlist.add(1);
                res.add(currlist);
            } else if (i==2){
                currlist.add(1);
                currlist.add(1);
                res.add(currlist);
            }else{
                LinkedList<Integer> lastlist = (LinkedList<Integer>) res.getLast();
                for (int j = 0; j < i; j++) {
                    if(j==0){
                        currlist.add(1);
                    } else if (j==i-1) {
                        currlist.add(1);
                    }else{
                        currlist.add(lastlist.get(j-1)+ lastlist.get(j));
                    }
                }
                res.add(currlist);
            }
        }
        return res;


    }
}