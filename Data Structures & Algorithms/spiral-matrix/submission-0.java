class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> array = new ArrayList<>();

        int m = matrix.length, n = matrix[0].length;    
        int top = 0, down = m-1, left = 0, right = n-1;

        while(left <= right && top <= down){
            for (int i = left; i <= right; i++){
                array.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= down; i++){
                array.add(matrix[i][right]);
            }
            right--;

            if (top <= down){
                for (int i = right; i >= left; i--){
                    array.add(matrix[down][i]);
                }
                down--;
            }
            

            if (left <= right){
                for (int i = down; i >= top; i--){
                    array.add(matrix[i][left]);
                }
                left++;
            }
        } 

        return array;
        
    }
}
