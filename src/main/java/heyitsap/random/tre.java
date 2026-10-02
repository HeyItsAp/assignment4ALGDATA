package heyitsap.random;

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

    @Override
    public String toString(){
        return "";
    }
}
