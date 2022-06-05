class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count=0;   
        for(int i=0;i<s.length()-k+1;i++) 
        {
            String temp = s.substring(i,i+k);    
            int value = Integer.valueOf(temp); 
            if(value == 0)     
            {
                continue;
            }
            if(num % value == 0)      
            {
                count++;
            }
        }
        return count;
    }
}