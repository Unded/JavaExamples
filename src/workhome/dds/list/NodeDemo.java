package workhome.dds.list;

import java.util.Random;

public class NodeDemo {
    public static void main(String[] args) {
        Node tail = init(10);
        System.out.println("Node: " + toString(tail));
        System.out.println("Node length: " + length(tail));
        System.out.println("Node max value: " + findMax(tail));
        System.out.println("Node sum: " + sum(tail));
    }

    private static int sum(Node node) {
//        if (node.next == null){
//            return 0;
//        }else {
//            return node.value + sum(node.next);
//        }
        return (node.next == null) ? 0 : node.value + sum(node.next);
    }

    private static int length(Node node) {
//        if (node.next == null){
//            return 0;
//        }else {
//            return 1 + length(node.next);
//        }
        return (node.next == null) ? 0 : 1 + length(node.next);
    }

    private static int findMax(Node node) {
//        if (node.next == null) {
//            return 0;
//        } else {
//            return Math.max(node.value, findMax(node.next));
//        }
        return (node.next == null) ? 0 : Math.max(node.value, findMax(node.next));
    }

    private static Node init(int x) {
        if (x >= 0) {
            Random r = new Random();
            return new Node(r.nextInt(10), init(x - 1));
        } else {
            return null;
        }
    }

    private static String toString(Node node) {
        if (node.next == null) {
            return "null";
        } else {
            return "" + node.value + " " + toString(node.next);
        }
    }


}
