class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> map = new HashSet<>();
        int l = 0, r = 0, len = 0;
        while(r < n)
        {
            char ch = s.charAt(r);
            while(map.contains(ch))
                map.remove(s.charAt(l++));
            map.add(ch);
            len = Math.max(len, r-l + 1);
            r++;
        }
        return len;
    }
}