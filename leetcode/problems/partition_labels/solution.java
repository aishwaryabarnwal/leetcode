class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        int[] map = new int[26];

        for(int i=0;i<n;i++)
            map[s.charAt(i) - 'a'] = i; //get last occurance of each distinct character

        int start = 0, end = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            end = Math.max(end, map[ch - 'a']);

            if(end == i)
            {
                list.add(end-start+1);
                start = i + 1;
            }
        }
        return list;
    }
}