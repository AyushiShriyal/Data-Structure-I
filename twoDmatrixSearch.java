Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.

class Solution {
    
    // 1(00)   2(01)  3(02)   4(03)
    // 5(10)   6(11)  7(12)   8(13)
    // 9(20)  10(21)  11(22)  12(23)
    //m = 3, n = 4
    // num = i * n + (j + 1);
    // eg : 10 = 2 * 4 + (1 + 1);
    
    int[] numToindex(int num, int n){
        int i = 0, j = 0;
        if(num % n == 0){
            i = (num / n) - 1;
            j = n - 1;
        }
        else{
            i = num / n;
            j = (num % n) - 1;
        }
        return new int[]{i, j};
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 1, high = m * n;
        while(low <= high){
            int mid = (low + high) / 2;
            int[] index = numToindex(mid, n);
            if(matrix[index[0]][index[1]] > target)
                high = mid - 1;
            else if(matrix[index[0]][index[1]] < target)
                low = mid + 1;
            else
                return true;
        }
        return false;
    }
}