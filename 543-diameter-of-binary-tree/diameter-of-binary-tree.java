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
//Logic : to find diameter we have two cases first is that the diameter passes through root and second cases it is from any of the subtree
// So what we done here is
//first of all we take a Info class to store the height and diameter of every node in the tree
//why height because to find the length of the tree in which the root of the tree is a part
//So simply call for leftInfo and rightInfo of the root.left and root.right
//and simply find the diameter and height after the info
// return the info with diameter and height
//after finding the info object with diameter and height then we simply return the diameter


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
