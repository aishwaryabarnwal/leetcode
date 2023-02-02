class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] dic = new int[26];
        int n = order.length();
        for(int i=0;i<n;i++)
        {
            char ch = order.charAt(i);
            dic[ch-'a'] = i;
        }
        for(int i=0;i<words.length-1;i++)
        {
            String s1 = words[i];
            String s2 = words[i+1];
            int m = s1.length();
            for(int j=0;j<m;j++)
            {
                if(j < s2.length())
                {
                    char ch1 = s1.charAt(j);
                    char ch2 = s2.charAt(j);
                    if(dic[ch1 - 'a'] > dic[ch2 - 'a'])
                        return false;
                    else if(dic[ch1 - 'a'] < dic[ch2 - 'a'])
                        break;
                }
                else
                    return false;
            }
        }
        return true;
    }
}