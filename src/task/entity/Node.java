package task.entity;

public class Node {

    public int item;
    public Node left;
    public Node right;

    public Node(int key) {
        item = key;
        left = null;
        right = null;
    }
}
