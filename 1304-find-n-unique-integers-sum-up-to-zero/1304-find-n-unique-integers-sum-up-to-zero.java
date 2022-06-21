class Solution {
    public int[] sumZero(int n) {
        if(n==1){
            return new int[1];
        }
        int[] arr = new int[n];
        int neg = -1;
        int pos = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i] = neg;
            pos = pos+neg;
            neg--;
        }
        arr[arr.length-1] = pos*-1;
        return arr;

    }
}