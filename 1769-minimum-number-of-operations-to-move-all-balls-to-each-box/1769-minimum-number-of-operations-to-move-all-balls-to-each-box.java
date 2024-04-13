class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        
        for(int i=0; i<n; i++){
            int m = 0;
            for(int j=0; j<n; j++){
                m+= Math.abs(j-i) *  Character.getNumericValue(boxes.charAt(j));
            }
            
            res[i] = m;
        }
        
        return res;
    }
}