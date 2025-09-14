class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1 != n2)
            return false;
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();
        for(int i=0;i<n1;i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // If already mapped, check consistency
            if(mapST.containsKey(ch1))
            {
                if(mapST.get(ch1) != ch2)
                    return false;
            }
            else
            {
                // Check if c2 is already mapped by another char
                if(mapTS.containsKey(ch2))
                    return false;
            }

            mapST.put(ch1, ch2);
            mapTS.put(ch2, ch1);

        }
        return true;
    }
}