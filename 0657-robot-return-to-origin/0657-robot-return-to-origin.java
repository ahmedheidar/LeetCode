class Solution {
    public boolean judgeCircle(String moves) {
        int h = 0;
        int v = 0;
        for(char c: moves.toCharArray()){
            switch(c){
                case 'U': 
                    v++;
                    break;
                case 'D': 
                    v--;
                    break;
                case 'R':
                    h++;
                    break;
                case 'L':
                    h--;
                    break;
                    
            }
        }
        return h==0 && v==0;
    }
}