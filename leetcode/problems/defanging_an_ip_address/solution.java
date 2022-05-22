class Solution {
    public String defangIPaddr(String address) {
        //int n = address.length();
        // StringBuilder str = new StringBuilder();
        // for(int i=0;i<n;i++)
        // {
        //     if(address.charAt(i) == '.')
        //     {
        //         str.append("[.]");
        //     }
        //     else 
        //     {
        //         str.append(address.charAt(i));
        //     }
        // }
        // return str.toString();
        String res = address.replace(".","[.]");
        return res;
    }
}