class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set = new HashSet<>();
       int l = 0, r = 0, maxLen = 0;
       int n = s.length();
       while(r < n)
       {
            char ch = s.charAt(r);
            while(set.contains(ch))
                set.remove(s.charAt(l++));
            set.add(ch);
            maxLen = Math.max(maxLen, r-l+1);
            r++;
       }
       return maxLen;
    }
}