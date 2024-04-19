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

import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root ==null){
            return arr;
        }
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        st1.push(root);
        while(st1.size()>0 || st2.size()>0){
            ArrayList<Integer> level = new ArrayList<Integer>();
            while(st1.size()>0){
                TreeNode curr = st1.pop();
                level.add(curr.val);
                if(curr.left!=null){
                    st2.push(curr.left);
                }
                if(curr.right!=null){
                    st2.push(curr.right);
                }
            }
            if(level.size()>0){
                arr.add(level);
            }
            level = new ArrayList<Integer>();
            while(st2.size()>0){
                TreeNode curr = st2.pop();
                level.add(curr.val);
                if(curr.right!=null){
                    st1.push(curr.right);
                }
                if(curr.left!=null){
                    st1.push(curr.left);
                }
            }
            if(level.size()>0){
                arr.add(level);
            }
        }
        return arr;
    }
}