class Solution {
    public boolean checkString(String s) {
        boolean bFlag = false;
        
        for(char c: s.toCharArray()){
            if(bFlag){
                if(c=='a'){
                    return false;
                }
                continue;
            }
            if(c=='b'){
                bFlag = true;
            }
        }
        
        return true;
    }
}