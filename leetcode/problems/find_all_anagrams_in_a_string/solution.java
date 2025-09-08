class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int s1 = s.length();
        int p1 = p.length();
        List<Integer> list = new ArrayList<>();
        if(s1 < p1)
            return list;
        int l = 0, r = 0;
        int[] counts = new int[26];
        int[] countp = new int[26];
        for(int i=0;i<p1;i++)
        {
            countp[p.charAt(i) -'a']++;
            counts[s.charAt(i) -'a']++;
            r++;
        }
        r--;
        while(r < s1)
        {
            boolean flag = true;
            for(int i=0;i<26;i++)
            {
                if(counts[i] != countp[i])
                {
                    flag = false;
                    break; 
                }
            }
            if(flag)
                list.add(l);
            r++;
            if(r != s1)
            {
                counts[s.charAt(r) - 'a']++;
            }
            counts[s.charAt(l) - 'a']--;
            l++;
        }
        return list;
    }
}