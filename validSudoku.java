Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.



class Solution 
{
    public boolean isValidSudoku(char[][] board)
    {
        // O(1) time | O(1) space
        HashSet<String> mySet = new HashSet<>();
        
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(board[i][j] != '.')
                {
                    if(mySet.contains("row" + i + board[i][j]) || mySet.contains("col" + j + board[i][j]) || mySet.contains("box" + i/3 + j/3 + board[i][j]))
                        return false;
                    
                    mySet.add("row" + i + board[i][j]);
                    mySet.add("col" + j + board[i][j]);
                    mySet.add("box" + i/3 + j/3 + board[i][j]);
                }
            }
        }
        return true;
    }
}