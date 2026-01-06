class Solution {
    //brute force
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<>();
        backTrack(new StringBuilder(), 0, 0, n, res);
        return res;
    }

    public void backTrack(StringBuilder sb, int open, int close, int n, List<String> list) 
    {
        if(sb.length() == 2*n)
        {
            list.add(sb.toString());
            return;
        }
        if(open < n)
        {
            sb.append("(");
            backTrack(sb, open+1, close, n, list);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close < open)
        {
            sb.append(")");
            backTrack(sb, open, close+1, n, list);
            sb.deleteCharAt(sb.length()-1);
        }    
    }
}