class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) 
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] freq = new char[26];
            for(char ch : s.toCharArray())
                freq[ch - 'a']++;
            String keyStr = String.valueOf(freq);
            map.computeIfAbsent(keyStr, x -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}