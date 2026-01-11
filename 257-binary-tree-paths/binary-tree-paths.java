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
        List<String> res = new ArrayList<>();
        String temp = "";
        dfs(root,temp, res);
        return res;
    }
    public void dfs(TreeNode root,String temp, List<String> res){
        if(root==null) return;
        String newPath;
        if(temp.isEmpty()){
            newPath = Integer.toString(root.val);
        }else{
            newPath = temp + "->" + root.val;
        }
        temp = newPath;
        if(root.left == null && root.right == null){
            res.add(temp);
        }else{
            dfs(root.left,temp,res);
            dfs(root.right,temp,res);
        }

    }
}