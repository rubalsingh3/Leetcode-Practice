/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    int left(Node root){
        if(root.left == null)return root.data;
        // Node left= root.left;
        return left(root.left);
    }
    public int minValue(Node root) {
        // code here
        return left(root);
    }
}