class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] != '.')
                {
                    if(!isValid(board, i, j, board[i][j]))
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board, int row, int col, char num) {
        for(int r=0;r<9;r++)
        {
            if(r != row && board[r][col] == num)
                return false;
        }

        for(int c=0;c<9;c++)
        {
            if(c != col && board[row][c] == num)
                return false;
        }
        int r = row / 3 * 3;
        int c = col / 3 * 3;
        for(int i=r;i<r+3;i++)
        {
            for(int j=c;j<c+3;j++)
            {
                if((i != row || j!= col) && board[i][j] == num)
                    return false;
            }
        }
        return true;    
    }
}