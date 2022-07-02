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
    public List<Integer> preorderTraversal(TreeNode root) {
        //List<Integer> result = new ArrayList<Integer>();
        // if (root != null){
        //     result.add(root.val);
        //     result.addAll(preorderTraversal(root.left));
        //     result.addAll(preorderTraversal(root.right));
        // }
        List<Integer> result = new LinkedList<Integer>();
        if(root == null)
            return result;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.empty())
        {
            TreeNode visit = st.pop();
            result.add(visit.val);
            if(visit.right != null)
                st.push(visit.right);
            if(visit.left != null)
                st.push(visit.left);    
        }
        return result;
          
    }
}