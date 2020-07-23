'''

import java.util.*;

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
    HashMap<Integer,ArrayList<Pair<Integer,Integer>>> map=new HashMap<>();
    int min=0;
    int max=0;
    public void tranverse(int level, TreeNode node,int row){
        if(map.containsKey(level)){
            map.get(level).add(new Pair<Integer,Integer>(row,node.val));
        }
        else{
            ArrayList<Pair<Integer,Integer>> temp=new ArrayList<>();
            temp.add(new Pair<Integer,Integer>(row,node.val));
            map.put(level,temp);
        }
        
        if(node.left!=null){
            min=Math.min(min,level-1);
            tranverse(level-1,node.left,row+1);
        }
        if(node.right!=null){
            max=Math.max(max,level+1);
            tranverse(level+1,node.right,row+1);
        }
    }
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null){
            return result;
        }
        
        tranverse(0,root,0);
        for(int i=min;i<=max;i++){
            Collections.sort(map.get(i),new Comparator<Pair<Integer,Integer>>(){
                @Override
                public int compare(Pair<Integer,Integer>p1, Pair<Integer,Integer>p2){
                    return p1.getKey()-p2.getKey();
                }
            });
            List<Integer> sortedColumn = new ArrayList();
                for (Pair<Integer, Integer> p : map.get(i)) {
                    sortedColumn.add(p.getValue());
            }
            result.add(sortedColumn);
        }
        
        return result;
        
    }
}

'''
