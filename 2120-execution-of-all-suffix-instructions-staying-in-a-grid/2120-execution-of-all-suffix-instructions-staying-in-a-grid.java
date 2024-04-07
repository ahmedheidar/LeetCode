class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] res = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            int counter = 0;
            int x = startPos[1];
            int y = startPos[0];
            for(int j=i; j<s.length(); j++){
                char c = s.charAt(j);
                if(c=='R'){
                    x++;
                }else if(c=='L'){
                    x--;
                }else if(c=='D'){
                    y++;
                }else{
                    y--;
                }
                if(x>=0 && x<n && y>=0 && y<n)
                    counter++;
                else
                    break;
            }
            
            res[i] = counter;
        }
        
        return res;
    }
}