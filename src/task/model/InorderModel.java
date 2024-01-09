package task.model;

import task.entity.Node;

public class InorderModel {

    public String inorder(Node node) {
        if (node == null)
            return "";

        return inorder(node.left) +
                node.item + " " +
                inorder(node.right);
    }
}
