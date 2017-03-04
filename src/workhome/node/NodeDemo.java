package workhome.node;

public class NodeDemo {
    public static void main(String[] args) {
        Node n0 = new Node("n0");
        Node n1 = new Node("n1");
        n1.setParent(n0);
        Node n2 = new Node("n2");
        n2.setParent(n1);

        System.out.println("n0 has child " + n0.getChild() + " and has parent " + n0.getParent());
        System.out.println("n1 has child " + n1.getChild() + " and has parent " + n1.getParent());
        System.out.println("n2 has child " + n2.getChild() + " and has parent " + n2.getParent());
    }
}
