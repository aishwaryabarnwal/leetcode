class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0, h = m * n - 1;
        while(l <= h)
        {
            int mid = l + (h-l) / 2;        
            int val = matrix[mid / n][mid % n]; // convert 1D index to 2D
            // /row = mid / n → integer division tells us which row.
            //col = mid % n → remainder tells us which column inside that row.
            if(target == val)
                return true;
            else if(target < val)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return false;
    }
}