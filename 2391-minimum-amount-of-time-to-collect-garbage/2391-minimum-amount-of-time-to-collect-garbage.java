class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int time = 0;
        int mi=0;
        int pi = 0;
        int gi = 0;
        
        for(int i=0; i<garbage.length; i++){
            for(char c: garbage[i].toCharArray()){
                if(c=='M'){
                    mi = i;
                }
                else if(c=='P'){
                    pi = i;
                }
                else{
                    gi = i;
                }
            }
        }
        
        for(int i=0; i<garbage.length; i++){
            time+= garbage[i].length();
            if(i<mi)
                time+=travel[i];
            if(i<pi)
                time+=travel[i];
            if(i<gi)
                time+=travel[i];
        }
        
        return time;
    }
}