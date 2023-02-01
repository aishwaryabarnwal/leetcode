class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        //Two strings str1 and str2 will have gcd if and only 
        //if str1+str2==str2+str1str1+str2 == str2+str1str1+str2==str2+str1
        if(!(str1+str2).equals(str2+str1))
            return "";
        //length of the answer or the GCD string 
        // /our answer will be substring of length 222 from any of the strings str1 or str2.
        int res = gcd(str1.length(), str2.length());
            return str2.substring(0, res);

    }
    public int gcd(int a, int b)
    {
        return (b==0) ? a : gcd(b, a % b);
    }
}