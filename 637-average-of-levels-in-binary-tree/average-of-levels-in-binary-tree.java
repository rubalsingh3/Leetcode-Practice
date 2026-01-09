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
    public List<Double> averageOfLevels(TreeNode root) { 
        Double avg = 0.0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        Double sum = 0.0;
        List<Double> arr = new ArrayList<>();


        if(root == null) return arr;
        while(!q.isEmpty()){
            sum = 0.0;
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                sum += curr.val;
            }
            
            arr.add(sum/size);
            
        }
        return arr;
    }
}