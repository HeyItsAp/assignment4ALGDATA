package heyitsap.random;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class tre {
    private treNode root;

    public tre (){
        this.root = null;
    }

    public void insert(String value){
        root = insertRecusively(root,value);
    }

    static treNode insertRecusively(treNode node, String value){
        if (node == null) return new treNode(value);


        if (value.compareTo(node.getValue()) > 0){ // if a less than b, left node
            node.setRight(insertRecusively(node.getRight(),value));
        } else if (value.compareTo(node.getValue()) < 0){ // if a comes after b, right node
            node.setLeft(insertRecusively(node.getLeft(), value));
        }
        return node;
    }


    /**
     * Breath first Printing
     * @code Uses a queue.
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        print(root, 0, sb);
        return sb.toString();
    }
    private void print(treNode node, int depth, StringBuilder sb) {
        if (node == null) {
            return;
        }
        print(node.getRight(), depth + 1, sb);
        sb.append("    ".repeat(depth)).append(node.getValue()).append("\n");
        print(node.getLeft(), depth + 1, sb);
    }
}
