package heyitsap.random;

public class treNode {
    private treNode left;
    private treNode right;
    private int value;

    public treNode(int value){
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

    public int getValue() {
        return value;
    }

    public void setRight(treNode right) {
        this.right = right;
    }

    public void setLeft(treNode left) {
        this.left = left;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
