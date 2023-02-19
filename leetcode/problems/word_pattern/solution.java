class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        //int[] freq = new int[26];
        String[] splited = s.split("\\s+");
        int n1 = pattern.length();
        int n2 = splited.length;
        if(n1 != n2)
            return false;
        for(int i=0;i<n1;i++)
        {
            char ch = pattern.charAt(i);
            String str = splited[i];
            if(map.containsKey(ch))
            {
                if(!map.get(ch).equals(str))
                {
                    return false;
                }
            }
            else if(map.containsValue(str))
            {
                return false;
            }
            else
                map.put(ch, str);
        }
        return true;
    }
}