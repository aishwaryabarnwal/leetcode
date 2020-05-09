class Solution {
public:
    bool isPerfectSquare(int num) {
        long res = 0, i = 1;
            while(res < num)
            {
                res += i;
                if(res == num)
                    return true;
                i += 2;
            }
        return false;
    }
};