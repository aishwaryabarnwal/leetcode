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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int lMin = minDepth(root.left);
        int rMin = minDepth(root.right);
        if(lMin == 0)
            return rMin + 1;
        if(rMin == 0)
            return lMin + 1;
        return Math.min(lMin, rMin) + 1;
    }
}