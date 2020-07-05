package 牛客网.剑指offer;

import java.util.*;
/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
public class Solution {

    Stack<TreeNode> stack=new Stack<TreeNode>();
    public void toStack(TreeNode node){
        if (node.right!=null){
            toStack(node.right);
        }
        stack.push(node);
        if (node.left!=null){
            toStack(node.left);
        }
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        toStack(pRootOfTree);
        TreeNode pointer=stack.pop();
        TreeNode head=pointer;
        TreeNode temp;
        while (!stack.isEmpty()){
            temp=stack.pop();
            pointer.right=temp;
            temp.left=pointer;
            pointer=temp;
        }
        //pointer.right=head;
        //head.left=pointer;
        return head;
    }
}