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
    public List<Integer> postorderTraversal(TreeNode root) {
         ArrayList<Integer> arr = new ArrayList<Integer>();
    Stack<TreeNode> st1 = new Stack<TreeNode>();
    Stack<TreeNode> st2 = new Stack<TreeNode>();
    if(root==null){
        return arr;
    }
    TreeNode node;
    st1.push(root);
    while(st1.size()>0){
        node = st1.pop();
        st2.push(node);
        if(node.left!=null){
            st1.push(node.left);
        }
        if(node.right!=null){
            st1.push(node.right);
        }
    }
    while(st2.size()>0){
        node = st2.pop();
        arr.add(node.val);
    }
    return arr;
    }
}