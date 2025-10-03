class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char ch : s.toCharArray()) 
        {
            if(ch == '(')
            {
                st.push(')');
                continue;
            }
            else if(ch == '{')
            {
                st.push('}');
                continue;
            }
            else if(ch == '[')
            {
                st.push(']');
                continue;
            }
            else if(st.isEmpty() || st.pop() != ch)
                return false;
        }
        return (st.isEmpty());
    }
}