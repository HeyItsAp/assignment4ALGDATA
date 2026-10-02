package heyitsap.random;

public class treNode {
    private treNode left;
    private treNode right;
    private String value;

    public treNode(String value){
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public treNode getLeft() {
        return left;
    }

    public treNode getRight() {
        return right;
    }

    public String getValue() {
        return value;
    }

    public void setRight(treNode right) {
        this.right = right;
    }

    public void setLeft(treNode left) {
        this.left = left;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
