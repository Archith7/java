class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class preorder {

    static void inorder(Node root){
        if(root==null) return;
        System.out.println(root.data);
        inorder(root.left);
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        inorder(root);
    }
}
