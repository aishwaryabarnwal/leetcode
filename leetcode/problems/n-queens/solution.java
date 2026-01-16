class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board)
            Arrays.fill(row, '.');
        
        dfs(board, 0, result); // row = 0;
        return result;
    }

    public void dfs(char[][] board, int row, List<List<String>> result)
    {
        if(row == board.length)
        {
            result.add(construct(board));
            return;
        }
        
        for(int col=0;col<board.length;col++)
        {
            if(isSafe(board, row, col))
            {
                board[row][col] = 'Q';
                dfs(board, row+1, result);
                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col)
    {
        //up
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col] == 'Q')
                return false;
        }

        //left - diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j] == 'Q')
                return false;
        }

        //right - diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public List<String> construct(char[][] board)
    {
        List<String> result = new ArrayList<>();
        for(char[] row : board)
            result.add(new String(row));
        return result;
    }
}