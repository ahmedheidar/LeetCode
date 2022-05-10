class Solution {
    public int[] plusOne(int[] digits) {
        int j = digits.length-1;
        boolean flag = false;
        for (int digit : digits) {
            if (digit == 9) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag){
            int[] result = new int[digits.length+1];
            result[0]=1;
            return result;
        }else{
                if (digits[j] == 9) {
                    while(j>-1 && digits[j]==9){
                        digits[j]=0;
                        j--;
                    }
                }
            digits[j]+=1;
            return digits;
        }

    }
}