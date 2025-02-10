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
 class Info{
        int diam;
        int ht;
        Info(int d,int h){
            this.diam=d;
            this.ht=h;
        }
    } 
  class Solution {
    
    public  Info diameterInfoBinaryTree(TreeNode root) {
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo=diameterInfoBinaryTree(root.left);
        Info rightInfo=diameterInfoBinaryTree(root.right);

        int diameter=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diameter,ht);

        
    }
    public int diameterOfBinaryTree(TreeNode root){
        Info info=diameterInfoBinaryTree(root);
        return info.diam-1;
    }
}