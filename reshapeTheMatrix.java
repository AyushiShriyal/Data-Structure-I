In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.


class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        
        int r_mat = mat.length;
        int c_mat = mat[0].length;
        
        if(r*c != r_mat*c_mat)
        {
            return mat;
        }
        
        int[][] ans = new int[r][c];
        
        for(int i = 0; i< r*c; i++)
        {
//             p_mat, q_mat: row, col for matrix mat
//             p, q: row, col for the new matrix
            int p_mat = i/c_mat, q_mat = i%c_mat;
            int p = i/c, q = i%c;
            ans[p][q] = mat[p_mat][q_mat];
        }
        
        
        return ans;
        
    }
}