class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length(), n2 = str2.length();
        if(!(str1 + str2).equals(str2 + str1))
            return "";
        int gcdNo = gcd(n1, n2);
        return str2.substring(0, gcdNo);
    }
    public int gcd(int a, int b) {

        return (b==0)? a : gcd(b, a % b);
    }
}