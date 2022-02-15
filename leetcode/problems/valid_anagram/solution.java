class Solution {
    public boolean isAnagram(String s, String t) {
        int [] map = new int[26];
        int n1 = s.length(), n2 = t.length();
        if(n1 != n2)
            return false;
        for(int i=0;i<n1;i++)
        {
            map[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<n2;i++)
        {
            if(map[t.charAt(i) - 'a'] != 0){
                map[t.charAt(i) - 'a']--;
                //count++;
            }
            else
                return false;
        }
        return true;
    }
}