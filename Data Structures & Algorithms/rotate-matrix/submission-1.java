class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];

        /*
            1  2      3  1
            3  4      4  2

            00 01     10 00
            10 11     11 01

        */

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                newMatrix[i][j] = matrix[n-j-1][i]; 
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = newMatrix[i][j];
            }
        }



    }
}
