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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        if(root==null) return result;
        String current_path=Integer.toString(root.val);
        if(root.left==null && root.right==null) result.add(current_path);
         if(root.left!=null) 
         dfs(root.left,result,current_path);
         if(root.right!=null) 
         dfs(root.right,result,current_path);
         
         return result;
    }

    public void dfs(TreeNode root,List<String> result,String current_path){
        current_path+="->"+root.val;
        if(root.left==null && root.right==null){ result.add(current_path);
        return;
        }
        if(root.left!=null) 
        dfs(root.left,result,current_path);
        if(root.right!=null) 
        dfs(root.right,result,current_path);
    }
}