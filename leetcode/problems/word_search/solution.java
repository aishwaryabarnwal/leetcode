class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;


        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if(searchDfs(board, word, r, c, 0))
                    return true;
            }
        }
        return false;

    }

    public boolean searchDfs(char[][] board, String word, int i, int j, int idx)
    {
        if(idx == word.length())
            return true;
        

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || 
            board[i][j] != word.charAt(idx))
            return false; 
        
        board[i][j] = '*';

        boolean result = searchDfs(board, word, i+1, j, idx+1) || 
                searchDfs(board, word, i-1, j, idx+1)
                || searchDfs(board, word, i, j+1, idx+1) ||
                searchDfs(board, word, i, j-1, idx+1);

        board[i][j] = word.charAt(idx);
        return result;
    }
}