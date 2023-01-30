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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        int lMax = depth(root.left);
        int rMax = depth(root.right);
        return (Math.abs(rMax-lMax)) > 1 ? false :
        (isBalanced(root.left) && isBalanced(root.right));

    }
    public int depth(TreeNode root) {
        if(root == null)
            return 0;
        int l1 = depth(root.left) + 1;
        int l2 = depth(root.right) + 1;
        return Math.max(l1, l2);
    }
}