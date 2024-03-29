package task.view;

import task.entity.Node;

public class TaskView {

    public Node root;

    public BinaryTree createTree() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right.right = new Node(12);
        return tree;
    }

    public TaskView() {
        root = null;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
