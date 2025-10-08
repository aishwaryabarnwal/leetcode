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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode tree = new TreeNode();
        Map<Integer, Integer> inMap = new HashMap<>();
        int n = inorder.length;
        for(int i=0;i<inorder.length;i++)
            inMap.put(inorder[i], i);
        tree = buildTree(preorder, 0, preorder.length - 1, inorder, 0, n-1, inMap);
        return tree;
    }

    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder,
                            int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if(preStart > preEnd || inStart >inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder,
                            inStart, inRoot - 1, inMap);
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder,
                            inRoot + 1, inEnd, inMap);
        return root;
    }

}