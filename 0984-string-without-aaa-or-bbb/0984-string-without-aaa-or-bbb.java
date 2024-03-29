class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int aa = 0;
        int bb = 0;
        int ac = 0;
        int bc = 0;
        int cc = 0;
        while(aa+bb<a+b){
            if(a-aa>b-bb){
                if(cc==2){
                    sb.append("b");
                    bb++;
                    cc=0;
                    continue;
                }
                sb.append("a");
                aa++;
                cc++;
            }else{
                if(cc==-2){
                    sb.append("a");
                    aa++;
                    cc=0;
                }
                sb.append("b");
                bb++;
                cc--;
            }
        }            

        
        return sb.toString();
    }
}