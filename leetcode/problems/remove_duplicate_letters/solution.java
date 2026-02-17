class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int[] lastOcc = new int[26];
        for(int i=0;i<n;i++)
            lastOcc[s.charAt(i) - 'a'] = i;
        
        boolean[] seen = new boolean[26];
        Stack<Character> st = new Stack<>();

        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(seen[ch - 'a'])
                continue;

            while(!st.isEmpty() && st.peek() > ch && lastOcc[st.peek() - 'a'] > i)
                seen[st.pop() - 'a'] = false;

            st.push(ch);
            seen[ch - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st)
            sb.append(ch);
        
        return sb.toString();
    }
}