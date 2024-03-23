package app.data;

import app.util.BinaryTree;
import app.util.Node;

public class DataRepository {

    public BinaryTree getBinaryTree(){
        BinaryTree tree = new BinaryTree();
        tree.rote = new Node(1);
        tree.rote.left = new Node(2);
        tree.rote.right= new Node(3);
        tree.rote.left.left = new Node(4);
        tree.rote.left.right = new Node(5);
        tree.rote.right.left = new Node(6);
        tree.rote.right.right = new Node(7);
        tree.rote.left.right.left = new Node(8);
        tree.rote.left.right.right = new Node(9);
        tree.rote.right.right.left = new Node(10);
        tree.rote.left.right.left.left = new Node(11);
        tree.rote.left.right.left.right = new Node(12);
        return tree;
    }

}
