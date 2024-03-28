class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> rows = new ArrayList();
        
        for(String row : bank){
            int c = 0;
            for(char laser: row.toCharArray()){
                if(laser=='1')
                    c++;
            }
            
            if(c!=0)
                rows.add(c);
        }
        
        int score = 0;
        
        for(int i=0; i<rows.size()-1; i++){
            score += rows.get(i)*rows.get(i+1);
        }
        
        return score;
    }
}