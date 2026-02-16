class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();

        int[] lastOcc = new int[26];
        for(int i=0;i<n;i++)
            lastOcc[s.charAt(i) - 'a'] = i; //get last occurance of each distinct character
        
        boolean[] seen = new boolean[26];
        Stack<Character> st = new Stack<>();
        //monotonic increasing stack and remove characters that are lexicographically 
        // larger than current character if they appear later again
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(seen[ch - 'a']) //if already seen
                continue;

            // top > current character (lexicographically bigger) and 
            // top appears again later then, pop it
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