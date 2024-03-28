class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> rows = new ArrayList();
        int score = 0;
        int prev = 0;
        for(String row : bank){
            int c = 0;
            for(char laser: row.toCharArray()){
                if(laser=='1')
                    c++;
            }
            
            if(c==0)
                continue;
            score+= c*prev;
            prev = c;
        }
        
        
        return score;
    }
}