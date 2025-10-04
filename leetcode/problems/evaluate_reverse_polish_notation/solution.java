class Solution {
    public int evalRPN(String[] tokens) {
        int top = -1;
        int[] st = new int[tokens.length];
        for(String s : tokens)
        {
            if(! "+-*/".contains(s))
                st[++top] = Integer.valueOf(s);
            else
            {
                int a = st[top--];
                int b = st[top];
                switch(s)
                {
                    case "+" :
                        st[top] = b + a;
                        break;
                    case "-" :
                        st[top] = b - a;
                        break;
                    case "*" :
                        st[top] = b * a;
                        break;
                    case "/" :
                        st[top] = b / a;
                        break;  
                }
            }
        }
        return st[top];
    }
}