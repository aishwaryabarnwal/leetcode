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
    TreeNode* insert(TreeNode* root, int z)
    {
        if(root == NULL)
            return new TreeNode(z);
        if(z < root->val)
            root->left = insert(root->left, z);
        else
            root->right = insert(root->right, z);
        return root;
    }
    TreeNode* bstFromPreorder(vector<int>& preorder) {
        TreeNode* root = NULL;
        int n = preorder.size();
        for(int i=0;i<n;i++)
            root = insert(root, preorder[i]);
        return root;
    }
};