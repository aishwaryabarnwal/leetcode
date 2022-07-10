class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis = new boolean[n];
        HashSet<Integer> [] graph = new HashSet[n]; 
        for(int i=0;i<n;i++)
        {
            graph[i] = new HashSet<Integer>();
        }
        for(int[] edge : edges)
        {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        if(graph[source].contains(destination))
            return true;
        Queue<Integer> q = new LinkedList<Integer>();
        int N, curr;
        q.offer(source);
        vis[source] = true;
        //here only source component can contain path. So traversing each component is not           //required. Hence extra for lopp is not required in start to traverse other                 //components
        while(!q.isEmpty())
        {
            N = q.size();
            curr = q.poll();
            if(curr == destination)
                return true;
            
            for(Integer neighbour : graph[curr])
            {
                if(!vis[neighbour])
                {
                    vis[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
        return false;
    }
}