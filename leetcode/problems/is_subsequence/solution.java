class Solution {
    public boolean isSubsequence(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();
        if(s1 > t1)
            return false;
        if(s1<1)
            return true;
        int i = 0, j = 0;
        while(i < s1 && j <t1)
        {
            if(s.charAt(i) == t.charAt(j))
                i++;
            j++;
            if(i == s1)
                return true;
        }
        return false;
    }
}