/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node insert(Node root, int key) {
        // code here
        Node nn = new Node(key);
        if(root == null) return nn;
        Node temp = root, prev = null;
        while(temp!= null){
            prev = temp;
            if(key <temp.data){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        if(key<prev.data){
            prev.left = nn;
        }else{
            prev.right = nn;
        }
        return root;
    }
}
