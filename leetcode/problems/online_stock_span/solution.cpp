class StockSpanner {
public:
    stack<pair<int, int>> st;
    int ind = 0;
    StockSpanner() {
        
    }
    
    int next(int price) 
    {
        if (st.empty()) 
        {
            st.push({price, ind++});
            return 1;
        } 
        else 
        {
            while (!st.empty() && price >= st.top().first)
            {
                st.pop();
            }
            int res = 0;
            res = st.empty() ? ind + 1 : ind - st.top().second;
            st.push({price, ind++});
            return res;
        }    
    }
};

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */