class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1,j=num2.length()-1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while(i>=0 || j>=0){
            int n1 = 0;
            int n2 = 0;
            if(i>=0){
                n1 = num1.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                n2 = num2.charAt(j) - '0';
                j--;
            }
            //System.out.println(n1 +" "+n2+" "+carry);
            int sum = n1 + n2 + carry;
            carry = sum/10;
            sum = sum % 10;
            res.append(sum);
        }
        if(carry != 0)res.append(carry);
        return res.reverse().toString();

    }
}