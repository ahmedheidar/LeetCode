class Solution {
    public int countAsterisks(String s) {
        boolean flag = false;
        int n = 0;
        
        for(char c: s.toCharArray()){
            if(c=='|'){
                flag = !flag;
                continue;
            }
            if(flag==false){
                if(c=='*')
                    n++;
            }
            
            
        }
        
        return n;
    }
}