package app.data;

import app.ui.UIOperator;
import app.util.BinaryTree;
import app.util.Node;

public class DataHandler {

    private final DataRepository dataRepository = new DataRepository();
    private final UIOperator uiOperator = new UIOperator();

    public void handleData(){
        BinaryTree tree = dataRepository.getBinaryTree();

        uiOperator.getOutput("Inorder traversal: ");
        traverseInorder(tree.rote);
        uiOperator.getOutput("\n");

        uiOperator.getOutput("Preorder traversal: ");
        traversePreorder(tree.rote);
        uiOperator.getOutput("\n");

        uiOperator.getOutput("Postorder traversal: ");
        traversePostorder(tree.rote);
        uiOperator.getOutput("\n");

    }

    public void traverseInorder(Node node){
        if (node != null){
            traverseInorder(node.left);
            uiOperator.getOutput(node.value + " ");
            traverseInorder(node.right);
        }
    }

    public void traversePreorder(Node node){
        if (node != null){
            uiOperator.getOutput(node.value + " ");
            traversePreorder(node.left);
            traversePreorder(node.right);
        }
    }

    public void traversePostorder(Node node){
        if (node != null){
            traversePostorder(node.left);
            traversePostorder(node.right);
            uiOperator.getOutput(node.value + " ");
        }
    }

}
