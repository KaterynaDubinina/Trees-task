package task.model;

import task.entity.Node;

public class PreorderModel {
    public String preorder(Node node) {
        if (node == null)
            return "";

        return node.item + " " +
                preorder(node.left) +
                preorder(node.right);
    }
}
