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
// so here simply within a root just swap left and right node of the root and call for left subtree and right subtree of the root
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null ;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

         invertTree(root.left);
         invertTree(root.right);
         return root;
    }
}
