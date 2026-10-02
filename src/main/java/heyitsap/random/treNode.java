package heyitsap.random;

public class treNode {
    private treNode venstre;
    private treNode høyre;
    private int value;

    public treNode(treNode venstre, treNode høyre, int value){
        this.venstre = venstre;
        this.høyre = høyre;
        this.value = value;
    }

    public treNode getHøyre() {
        return høyre;
    }

    public treNode getVenstre() {
        return venstre;
    }

    public int getValue() {
        return value;
    }
}
