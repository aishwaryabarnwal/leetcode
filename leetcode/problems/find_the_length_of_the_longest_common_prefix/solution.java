class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        int maxPrefixLen = 0;
        if(arr1.length > arr2.length)
            return longestCommonPrefix(arr2, arr1);
        
        Set<String> prefixSet = new HashSet<>();
        for(int num : arr1)
        {
            String s = String.valueOf(num);
            for(int i=1;i<=s.length();i++)
            {
                prefixSet.add(s.substring(0, i));
                maxPrefixLen = Math.max(maxPrefixLen, i);
            }
        }
        int maxLcp = 0;
        for(int num : arr2)
        {
            String s = String.valueOf(num);
            for(int i=1;i<=Math.min(s.length(), maxPrefixLen);i++)
            {
                if(prefixSet.contains(s.substring(0, i)))
                    maxLcp = Math.max(maxLcp, i);
            }
        }
        return maxLcp;
    }
      
}