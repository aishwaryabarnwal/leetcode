class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0;i<n;i++)
        {
            char exp = s.charAt(i);
            if(exp == '(' || exp == '{' || exp == '[')
            {
                stack.push(exp);
                continue;
            }
     
            if(stack.isEmpty())
                return false;
            char x ;
            switch(exp)
            {
                case ')':
                    x = stack.pop();
                    if(x == '[' || x == '{')
                        return false;
                    break;
                case '}':
                    x = stack.pop();
                    if(x == '[' || x == '(')
                        return false;
                    break;
                case ']':
                    x = stack.pop();
                    if(x == '(' || x == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}