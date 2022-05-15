class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        String s = "";
        int k=0;
            while (k<nums1.length) {
                for (int i = 0 ;i< nums2.length;i++) {
                    if (nums1[k] == nums2[i]) {
                        s = s + nums1[k]+" ";
                        nums2[i]=-1;
                        break;
                    }
                }
                k++;
            }
        String[] tmp = s.split(" ");
        int[] x;
        if(!s.equals("")){
            x = new int[tmp.length];
            for (int i = 0; i < tmp.length; i++) {
                if (!tmp[i].equals("")) {
                    x[i] = Integer.parseInt(String.valueOf(tmp[i]));
                }
            }
        }else{
            x = new int[0];
        }
        return x;
    }
}