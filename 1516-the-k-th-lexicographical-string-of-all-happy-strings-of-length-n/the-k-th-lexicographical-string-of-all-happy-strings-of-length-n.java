class Solution {
    
    int count = 0;
    String res = "";
        
    public String getHappyString(int n, int k) {
        // Total happy strings: 3 * 2^(n-1)
        
        backtrack(n, k, new StringBuilder());
        return res;
    }

    public void backtrack(int n, int k, StringBuilder sb) {
        if(sb.length() == n)
        {
            count++;
            if (count == k) {
                res = sb.toString();
            }
            return;
        }    
        char[] ch = {'a', 'b', 'c'};
        for(char c : ch)
        {
            if(sb.length() > 0 && sb.charAt(sb.length() - 1) == c)
                continue;
            
            sb.append(c);
            backtrack(n, k, sb);

            if(!res.equals(""))
                return;
            
            sb.deleteCharAt(sb.length() - 1);
        }
        
    }

}