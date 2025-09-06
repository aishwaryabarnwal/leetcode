class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        int divisor = (int) Math.pow(10, k); // 10^k
    
        int temp = num;
        while (temp >= divisor / 10) {
            int subNum = temp % divisor; // last k digits or, k-digit number we extracted
            if (subNum != 0 && num % subNum == 0) { //if subNum is a divisor of num. num % subNum == 0
                count++;
            }
            temp /= 10; // slide window
        }
        return count;
    }
}