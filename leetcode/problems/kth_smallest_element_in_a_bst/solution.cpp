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
    int kthSmallest(TreeNode* root, int k) {
        int ks = INT_MIN;
        int count = 0;
        TreeNode* curr = root;
        while(curr != NULL)
        {
             if(curr->left == NULL)
             {
                 count++;
                 if(count == k)
                     ks = curr->val;
                 curr = curr->right;
             }
            else
            { 
                TreeNode* pre = curr->left; 
                while (pre->right != NULL && pre->right != curr) 
                    pre = pre->right; 

                if (pre->right == NULL) 
                { 
                    pre->right = curr; 
                    curr = curr->left; 
                } 
                else
                {
                    pre->right = NULL; 
                    count++; 
                    if (count == k) 
                        ks = curr->val; 
                    curr = curr->right; 
                }
            }
        }
        return ks;
    }
};