/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isCousins(TreeNode* root, int x, int y) {
        queue<pair<TreeNode*, int>> a;
        a.emplace(root, 0);
        int par = -1;
        while(!a.empty())
        {
           int n = a.size();
            for(int i=0;i<n;i++)
            {
                TreeNode* node = a.front().first;
                int v = a.front().second;
                if(node->val == x || node->val == y)
                {
                   if(par != -1)
                   {
                      if(par == v)
                          return false;
                       else
                           return true;
                   }
                    par = v;
                }
                a.pop();
                if(node->left)
                    a.emplace(node->left, node->val);
                if(node->right)
                    a.emplace(node->right, node->val);
            }
            if(par != -1)
                return false;
        }
        return false;
    }
};