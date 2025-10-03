class Solution {
    public String simplifyPath(String path) {
        Deque<String> st = new ArrayDeque<>();
        String[] directories = path.split("/");
        for(String dir : directories)
        {
            if(dir.equals(".") || dir.isEmpty())
                continue;
            else if(dir.equals(".."))
            {   
                if(!st.isEmpty())
                    st.pop();
            }
            else
                st.push(dir);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.insert(0, "/" + st.pop());
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}