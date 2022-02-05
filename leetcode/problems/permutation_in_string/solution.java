class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if(s2 == null && n2 == 0)
            return s1.equals(s2);
        if(n1 > n2)
            return false;
        int[] s1Map = new int[26];
        int[] s2Map = new int[26];
        for(int i=0;i<n1;i++)
        {
            s1Map[s1.charAt(i) - 'a']++;
            s2Map[s2.charAt(i) - 'a']++;
        }
        for(int i=0;i<(n2-n1);i++)
        {
            if(match(s1Map, s2Map))
                return true;
            
            s2Map[s2.charAt(i + n1) - 'a']++;
            s2Map[s2.charAt(i) - 'a']--;
        }
        return match(s1Map, s2Map);
        
    }
    public boolean match(int[] a1, int[] a2)
    {
        for(int i=0;i<26;i++)
        {
            if(a1[i] != a2[i])
                return false;
        }
        return true;
    }
}