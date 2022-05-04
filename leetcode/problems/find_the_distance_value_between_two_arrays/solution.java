class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int res  = 0;
        for(int num : arr1)
        {
            //|arr1[i] - arr2[j]| <= d equals to arr1[i] - d <= arr2[j] <= arr1[i] + d
            if(notInRange(arr2, num-d, num+d))
                res++;
        }
        return res;
    }
    // Checks if the array doesn't contain any value in range (from <= value <= to) using       //binary search
    private static boolean notInRange(int[] arr, int from, int to) {
        int l = 0;
        int h = arr.length - 1;
        
        while (l <= h) {
            int mid = (h + l) / 2;
            if (arr[mid] >= from && arr[mid] <= to) {
                return false;
            } 
            else if (arr[mid] < from) {
                l = mid + 1;
            } 
            else {
                h = mid - 1;
            }
        }
        return true;
    }
}