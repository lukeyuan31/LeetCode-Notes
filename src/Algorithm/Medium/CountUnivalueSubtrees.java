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
    int count=0;
    public boolean isUnival(TreeNode node){
        if(node.left==null && node.right==null){
            count++;
            return true;
        }
        boolean uniVal=true;
        if(node.left!=null){
            uniVal=isUnival(node.left) &&node.val==node.left.val && uniVal;
        }
        if(node.right!=null){
            uniVal=isUnival(node.right) && node.val==node.right.val &&uniVal;
        }
        if(uniVal==false){
            return false;
        }
        count++;
        return true;
    }
    public int countUnivalSubtrees(TreeNode root) {
        if(root==null){
            return 0;
        }
        isUnival(root);
        return count;
    }
}
