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
    public List<Integer> inorderTraversal(TreeNode root) {
//         ArrayList<Integer> res = new ArrayList<Integer>();
//         if(root == null)
//             return new ArrayList();
//         res.addAll(inorderTraversal(root.left));
//         res.add(root.val);
//         res.addAll(inorderTraversal(root.right));
        
//         return res;
        List<Integer> inorder = new LinkedList<Integer>();
        if(root == null)
            return inorder;
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode node = root;
        while(true)
        {
            if(node != null)
            {
                st.push(node);
                node = node.left;
            }
            else
            {
                if(st.isEmpty())
                {
                   break; 
                }
                node = st.pop();
                inorder.add(node.val);
                node = node.right;    
            }
        }
        return inorder;
    }
}