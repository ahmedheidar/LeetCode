class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length(); 
        Set<String> numsSet = new HashSet<>();
        
        for (String num : nums) {
            numsSet.add(num);
        }
        
        for (int i = 0; i < (1 << n); i++) {
            String binaryString = Integer.toBinaryString(i);
            while (binaryString.length() < n) {
                binaryString = "0" + binaryString;
            }
            
            if (!numsSet.contains(binaryString)) {
                return binaryString;
            }
        }
        
        return "";
    }
}