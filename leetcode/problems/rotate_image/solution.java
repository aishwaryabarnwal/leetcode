class Solution {
    public void rotate(int[][] matrix) {
        
        //90 = transpose + reverse row
        //180 = reverse row + reverse column
        //270 = transpose + reverse col
        int n = matrix.length;

        //transpose
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse each row
        for(int i=0;i<n;i++)
            reverseRow(matrix[i]);
 
    }

    public void reverseRow(int[] row) {
        int l = 0, r = row.length - 1;
        while(l < r)
        {
            int temp = row[l];
            row[l] = row[r];
            row[r] = temp;
            l++;
            r--;
        }
    }
}