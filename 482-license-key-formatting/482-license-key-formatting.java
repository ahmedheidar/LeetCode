class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String r = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!=45){
                if(s.charAt(i)>47 && s.charAt(i)<58){
                    r = r+s.charAt(i);
                }else{
                    String c = String.valueOf(s.charAt(i));
                    r = r + c.toUpperCase() ;
                }
            }
        }
        int groups = (int) Math.ceil((double) r.length()/(double) k);
        String res = "";
        int rPointer = r.length()-1;
        for (int i = 0; i <groups-1 ; i++) {
            for (int j = 0; j < k; j++) {
                res = r.charAt(rPointer) + res;
                rPointer--;
            }
            res = '-'+ res;
        }
        while (rPointer>-1){
            res = r.charAt(rPointer)+res;
            rPointer--;
        }

        return res;
    }
}