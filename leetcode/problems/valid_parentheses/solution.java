class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char exp = s.charAt(i);
            if(exp == '(' || exp == '{' || exp == '[')
            {
                st.push(exp);
                continue;
            }
            if(st.isEmpty())
            {
                return false;
            }
            char val;
            switch(exp)
            {
                case ')':
                    val = st.pop();
                    if(val == '{' || val == '[')
                        return false;
                    break;
                case '}':
                    val = st.pop();
                    if(val == '(' || val == '[')
                        return false;
                    break;
                case ']':
                    val = st.pop();
                   if(val == '(' || val == '{')
                        return false;
                    break;
            }
        }
        return (st.isEmpty());
    }
}