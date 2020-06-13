package Algorithm.Medium;
import java.util.*;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class LowestCommonAncestorofaBinaryTree {

    private TreeNode ans;

    public LowestCommonAncestorofaBinaryTree(){
        this.ans=null;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.findAncestor(root,p,q);
        return this.ans;
    }

    public boolean findAncestor(TreeNode node, TreeNode p, TreeNode q){
        if(node==null){
            return false;
        }

        int left=0;
        int right=0;
        int mid=0;

        if(findAncestor(node.left,p,q)){
            left=1;
        }

        if(findAncestor(node.right,p,q)){
            right=1;
        }

        if(node==p || node==q){
            mid=1;
        }

        if(mid+left+right>=2){
            this.ans=node;
        }

        return ((mid+left+right)>0);

    }
}
