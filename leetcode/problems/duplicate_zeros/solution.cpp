class Solution {
public:
    void duplicateZeros(vector<int>& arr) {
        int l = arr.size()-1;
        int pd = 0;
        for(int i=0;i<=l-pd;i++)
        {
           if(arr[i] == 0)
           {
              if(i == l-pd)
              {
                  arr[l] = 0;
                  l -= 1;
                  break;
              }
               pd++;
           }
        }
        int last = l - pd;
        for(int i=last;i>=0;i--)
        {
            if(arr[i] == 0)
            {
                arr[i+pd] = 0;
                pd--;
                arr[i+pd] = 0;
            }
            else
            {
                arr[i+pd] = arr[i];
            }
        }
    }
};