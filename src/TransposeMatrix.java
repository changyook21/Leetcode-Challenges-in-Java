public class TransposeMatrix {
/*
Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
*/

    public int[][] transpose(int[][] A) {
        int out = A.length, in = A[0].length;
        int[][] ans = new int[out][in];
        for (int i = 0; i < out; i++)
            for (int j = 0; j < in; j++) {
                ans[j][i] = A[i][j];
            }
        return ans;
    }

}
