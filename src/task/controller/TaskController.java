package task.controller;

import task.entity.Node;
import task.model.InorderModel;
import task.model.PostorderModel;
import task.model.PreorderModel;
import task.view.BinaryTree;
import task.view.TaskView;

public class TaskController {

    private final TaskView view = new TaskView();
    private final BinaryTree data = view.createTree();

    public void getInorder() {
        Node node = getNode();
        String output = "\n\u2705   Обхід неупорядкований:   " + new InorderModel().inorder(node);
        view.getOutput(output);
    }

    public void getPostorder() {
        Node node = getNode();
        String output = "\n\u2705   Обхід поступорядкований:   " + new PostorderModel().postorder(node);
        view.getOutput(output);
    }

    public void getPreorder() {
        Node node = getNode();
        String output = "\n\u2705   Обхід передупорядкований:   " + new PreorderModel().preorder(node);
        view.getOutput(output);
    }

    public void getAll() {
        Node node = getNode();
        String output = "\n\u2705   Обхід неупорядкований:     " + new InorderModel().inorder(node) +
                        "\n\u2705   Обхід поступорядкований:   " + new PostorderModel().postorder(node) +
                        "\n\u2705   Обхід передупорядкований:  " + new PreorderModel().preorder(node);

        view.getOutput(output);
    }

    private Node getNode() {
        return data.root;
    }
}