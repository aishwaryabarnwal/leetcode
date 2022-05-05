class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int n = arr.length;
        //if every element in the array > k , the answer would be k
        //for every element <= k , you need to increment k.
        //since the array is in increasing order, 
        //you can break out of the loop on the first instance this condition fails
        for(int i : arr)
        {
            if(i<=k)
                k++;
            else
                break;
        }
        return k;
        //https://leetcode.com/problems/kth-missing-positive-           number/discuss/779999/JavaC%2B%2BPython-O(logN)
        // int l = 0, r = A.length, m;
        // while (l < r) {
        //     m = (l + r) / 2;
        //     if (A[m] - 1 - m < k)
        //         l = m + 1;
        //     else
        //         r = m;
        // }
        // return l + k;
    }
}