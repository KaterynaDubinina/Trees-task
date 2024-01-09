package task.model;

import task.entity.Node;

public class PostorderModel {

    public String postorder(Node node) {
        if (node == null)
            return "";

        return postorder(node.left) +
                postorder(node.right) +
                node.item + " ";
    }
}
