package workhome.node;

public class Node {
    private String name;
    private Node parent = null;
    private Node child = null;

    public Node(String name) {
        this.name = name;
    }

    public String getParent() {
        return (this.parent == null) ? "null" : parent.getName();
    }

    public void setParent(Node parent) {
        this.parent = parent;
        parent.setChild(this);
    }

    public String getChild() {
        return (this.child == null) ? "null" : child.getName();
    }

    public void setChild(Node child) {
        this.child = child;
    }

    public String getName() {
        return name;
    }
}
