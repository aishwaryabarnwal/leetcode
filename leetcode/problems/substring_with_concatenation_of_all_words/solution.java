class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int n = s.length(), wCount = words.length, wLen = words[0].length();
        if(n == 0 || s == null || words == null || wLen == 0)
            return res;
        Map<String, Integer> freq = new HashMap<>();
        int winSize = wCount * wLen;

        for(String word : words)
            freq.put(word, freq.getOrDefault(word, 0)+1);
        
        for(int i=0;i<wLen;i++)
        {
            int l = i, r = i;
            Map<String, Integer> seen = new HashMap<>();
            int count = 0;
            while(r + wLen <= n)
            {
                String word = s.substring(r, r+wLen);
                r += wLen;
                if(freq.containsKey(word))
                {
                    seen.put(word, seen.getOrDefault(word, 0)+1);
                    count++;

                    while(seen.get(word) > freq.get(word))
                    {
                         //shrink for next possibility
                        String removeWord = s.substring(l, l+wLen);
                        seen.put(removeWord, seen.get(removeWord) - 1);
                        l += wLen;
                        count--;
                    }

                    if(count == wCount)
                    {
                        res.add(l);

                        //shrink for next possibility
                        String removeWord = s.substring(l, l+wLen);
                        seen.put(removeWord, seen.get(removeWord) - 1);
                        l += wLen;
                        count--;
                    }
                }
                else
                {
                    seen.clear();
                    count = 0;
                    l = r;
                }
            }
        } 
        return res; 
    }
}