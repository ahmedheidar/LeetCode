class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(n*m!=r*c){
            return mat;
        }
        int[][] res = new int[r][c];
        int rc = 0;
        int cc = 0;
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(cc<c){
                    res[rc][cc++] = mat[i][j];
                }else{
                    cc=0;
                    res[++rc][cc++] = mat[i][j];
                }
            }
        }
        return res;


    }
}