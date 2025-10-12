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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        return helper(root, targetSum, list, res);
    }
    public List<List<Integer>> helper(TreeNode root, int targetSum, 
                                List<Integer> list, List<List<Integer>> res) {
        if(root == null)
            return res;
        list.add(root.val);
        if(targetSum == root.val && root.left == null && root.right == null)
        {
            res.add(new ArrayList<>(list));
        }
        helper(root.left, targetSum - root.val, list, res);
        helper(root.right, targetSum - root.val, list, res);

        list.remove(list.size() - 1); // backtrack
        return res;
    }
}