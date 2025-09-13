class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> map = new HashSet<>();
        int l = 0, r = 0, len = 0, currlen = 0;
        while(r < n)
        {
            char ch = s.charAt(r);
            while(map.contains(ch)) {
                map.remove(s.charAt(l++));
                currlen--;
            }
                   
            map.add(ch);
            currlen++;
            if(currlen > len)
            {
                len = currlen;
            }
            r++;

        } 
        return len;
    }
}