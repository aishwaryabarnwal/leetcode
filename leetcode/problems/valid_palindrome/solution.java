class Solution {
    public boolean isPalindrome(String s) {
         int n = s.length();
        if(n == 0 || n == 1)
            return true;
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(ch);
            }
        }
        return (sb.toString().equals(sb.reverse().toString()));


    }
}