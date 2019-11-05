class Solution {
public:
     vector<int> findOrder(int n, vector<vector<int> >& prerequisites) {
       int s=prerequisites.size();        
        vector<vector<int>> v(n);
        vector<int> deg(n);
        vector<int> ans;
        for(int i=0;i<s;i++)
        {
            v[prerequisites[i][1]].push_back(prerequisites[i][0]);
            deg[prerequisites[i][0]]++;
        }
        queue<int> q;
        for(int i=0;i<n;i++)
        {
            if(deg[i]==0)
               q.push(i); 
        }
        while(!q.empty())
        {
            int x=q.front();
            q.pop();
            ans.push_back(x);
            vector<int>::iterator itr;
            for(itr=v[x].begin();itr!=v[x].end();++itr)
            {
                deg[*itr]--;
                if(deg[*itr]==0)
                    q.push(*itr);
            }
        }
        if(ans.size()!=n)
            ans.clear();
        return ans;
    }

};