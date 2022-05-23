class Solution {
    public int mostWordsFound(String[] sentences) {
        int res = 0;
        
        for(String temp : sentences)
        {
            // int min = 1;
            // for(int j=0;j<temp.length();j++)
            // {
            //     if(temp.charAt(j) == ' ')
            //     {
            //         min++;
            //     }
            // }
            // if(min >= res)
            // {
            //     res = min;
            // }
            res = Math.max(res, (temp.split(" ")).length);
        }
        return res;
    }
}