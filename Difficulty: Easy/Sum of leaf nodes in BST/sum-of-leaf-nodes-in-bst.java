/*node class of the binary ssearch tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {
    static void pre(Node root, int ans[]){
        if(root == null) return;
        if(root.left == null && root.right == null){
            ans[0] += root.data;
        }
        
        pre(root.left,ans);
        pre(root.right,ans);
    }
    public static int sumOfLeafNodes(Node root) {
        // code here
        int ans[] = new int[1];
        ans[0] = 0;
        pre(root,ans);
        return ans[0];
    }
}