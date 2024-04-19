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
    public TreeNode createTree(int[] inorder, int s1, int e1 , int[] postorder , int s2 ,int e2){
       if(s1>e1 || s2>e2){
            return null;
       } 
       TreeNode root = new TreeNode(postorder[e2]);
       if(s1==e1 || s2 == e2){
        return root;
       }
       int index = -1;
       
        for(int i=0; i<=e1; i++){
           if(inorder[i]== postorder[e2]){
             index = i;
             break;
        }
       } 
        int count = index - s1;
        root.left  = createTree(inorder, s1 , s1 + count - 1 , postorder , s2 , s2 + count-1); 
        root.right = createTree(inorder, index + 1 , e1 , postorder , s2 + count , e2-1); 
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        int m = postorder.length; 
        return createTree(inorder, 0, n-1, postorder, 0, m-1);

    }
}