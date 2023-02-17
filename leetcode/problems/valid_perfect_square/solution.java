class Solution {
    public boolean isPerfectSquare(int num) {
        int i=0;
        int j=46340;
        int mid = (i+j)/2;
        boolean res = false;
        while(i <= j){
            if(mid*mid < num){
                i = mid+1;
            }
            else if(mid*mid > num){
                j = mid-1;
            }else{
                res = true;
                break;
            }
            mid = (i+j)/2;
        }
        return res;
    }
}