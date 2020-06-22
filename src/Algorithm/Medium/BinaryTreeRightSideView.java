package Algorithm.Medium;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    List<Integer> result=new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return result;
        }
        traverse(root,0);
        return result;
    }

    public void traverse(TreeNode root, int level){
        if(level==result.size()){
            result.add(root.val);
        }
        if(root.right!=null){
            traverse(root.right,level+1);
        }
        if(root.left!=null){
            traverse(root.left,level+1);
        }
    }
}
