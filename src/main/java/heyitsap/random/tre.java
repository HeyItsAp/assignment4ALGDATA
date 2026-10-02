package heyitsap.random;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class tre {
    private treNode root;

    public tre (treNode rot){
        this.root = null;
    }

    public void insert(String value){
        root = insertRecusively(root,value);
    }

    static treNode insertRecusively(treNode node, String value){
        if (node == null) return new treNode(value);

        if (value.compareTo(node.getValue()) == -1){ // if a less than b, left node
             node.setLeft(insertRecusively(node.getLeft(), value));
        }
        else if (value.compareTo(node.getValue()) >= -1){ // if a less than b, left node
            node.setRight(insertRecusively(node.getRight(),value));
        }
        return node;
    }


    /**
     * Breath first Printing
     * @code Uses a queue.
     * @return
     */
    @Override
    public String toString(){
        if (root == null){
            return "";
        }
        List<treNode> queue = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        queue.add(root);
        while (!queue.isEmpty()){
            List<treNode> nextQueue = new ArrayList<>();

            for (treNode currentnode : queue){
                sb.append(currentnode.getValue()).append(" ");
                if (currentnode.getRight() != null){
                    nextQueue.add(currentnode.getRight());
                }
                if (currentnode.getLeft() != null){
                    nextQueue.add(currentnode.getLeft());
                }
            }
            queue = nextQueue;
            nextQueue = new ArrayList<>();
            sb.append("\n");

        }
        return sb.toString();
    }
}
