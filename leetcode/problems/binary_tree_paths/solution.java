/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String ans="";
        treePath(root, ans);
        return res;
    }
    public void treePath(TreeNode root, String value)
    {
        if(root==null)
            return;
        value += root.val;
        if(root.left == null && root.right == null)
        {
            res.add(value);
            return;
        }
        value += "->";
        treePath(root.left, value);
        treePath(root.right, value);
    }
}