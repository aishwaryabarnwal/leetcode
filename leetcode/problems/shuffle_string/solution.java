class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        // char[] ch = new char[n];
        // for(int i=0;i<n;i++)
        // {
        //     ch[indices[i]] = s.charAt(i);
        // }
        // return new String(ch);
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<n;i++)
        {
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }
}