class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int n = words.length;
        int i = 0;
        List<String> result = new ArrayList<>();
        while(i < n)
        {
            int lettersCount = words[i].length();
            int j = i + 1;
            int gaddhe = 0;
            while(j < n && lettersCount + 1 + gaddhe + words[j].length() <= maxWidth)
            {
                lettersCount += words[j].length();
                gaddhe++;
                j++;
            }
            int remSlots = maxWidth - lettersCount;
            int eachGaddhaSpace = gaddhe == 0 ? 0 : remSlots / gaddhe;
            int extraGaddhaSpace = gaddhe == 0 ? 0 : remSlots % gaddhe;

            if(j == n)
            {
                eachGaddhaSpace = 1;
                extraGaddhaSpace = 0;
            }
            result.add(findLine(i, j, eachGaddhaSpace, extraGaddhaSpace, words, maxWidth));
            i = j;
        }
        return result;
    }

    public String findLine(int i, int j, int eachGaddhaSpace, 
                    int extraGaddhaSpace, String[] words, int maxWidth) {
        
        String line = "";
        StringBuilder sb = new StringBuilder();
        for(int k=i;k<j;k++)
        {
            sb.append(words[k]);
            if(k == j-1)
                continue;

            for(int z=0;z<eachGaddhaSpace;z++)
                sb.append(" ");

            if(extraGaddhaSpace > 0)
            {
                sb.append(" ");
                extraGaddhaSpace--;
            }
        }

        while(sb.length() < maxWidth)
                sb.append(" ");
                
        return sb.toString();
    
    }
}