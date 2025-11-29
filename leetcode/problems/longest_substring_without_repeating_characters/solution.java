class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int  r = 0, l = 0;
        int len = 0;
        Set<Character> map = new HashSet<>();
        while(r < n)
        {
            char ch = s.charAt(r);
            while(map.contains(ch))
                map.remove(s.charAt(l++));
            map.add(ch);
            len = Math.max(len, r-l+1);
            r++;
        }
        return len;
    }
}