class Solution {
    public boolean checkRecord(String s) {
        int A=0;
        int L=3;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A'){
                A++;
                if(A==2){
                    return false;
                }
                L=3;
            }else if(s.charAt(i)=='L'){
                L--;
                if(L==0){
                    return false;
                }
            }else{
                L=3;
            }
        }
        return true;
    }
}