class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int l = 0, r = 0, len = 0;
        while(r < n)
        { 
            char ch = s.charAt(r);
            while(set.contains(ch))
                set.remove(s.charAt(l++));
            set.add(ch);
            len = Math.max(len, r-l+1);
            r++;
        }
        return len;
    }
}