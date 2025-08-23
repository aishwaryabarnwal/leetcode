class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char exp = s.charAt(i);
            if(exp == '(')
            {
                st.push(')');
                continue;
            }
            else if(exp == '{')
            {
                st.push('}');
                continue;
            }
            else if(exp == '[')
            {
                st.push(']');
                continue;
            }
            else if(st.isEmpty() || st.pop() != exp)
            {
                return false;
            }
            
        }
        return (st.isEmpty());
    }
}