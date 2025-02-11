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
//just find the left depth and right depth and find which is maximum and simply add 1 recursively
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ld=maxDepth(root.left);
        int rd=maxDepth(root.right);
        return Math.max(ld,rd)+1;
    }
}
