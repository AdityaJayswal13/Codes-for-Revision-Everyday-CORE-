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
//so go level wise ordering 
//first we put our element in a queue with a null to ensure the end of the level
//every time as we encounter null we simply add the all values and find maximum in all levels
// and simply returns the maximum
class Solution {
    public int maxLevelSum(TreeNode root) {
        int maxsum=Integer.MIN_VALUE;
        int sum=0,idx=0;
        int level=-1;
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            

            TreeNode curNode=q.remove();
            
            if(curNode==null){
                idx++;
                if(maxsum<sum){
                    maxsum=sum;
                    level=idx;
                }
                
                sum=0;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                sum+=curNode.val;
                if(curNode.left!=null){
                    q.add(curNode.left);
                }
                if(curNode.right!=null){
                    q.add(curNode.right);
                }
            }
        }
        return level;
    }
}
