package heyitsap.random;

public class numberNode {
    private numberNode neste;
    private numberNode forrige;
    private int value;

    public numberNode(numberNode neste, numberNode forrige, int value){
        this.neste = neste;
        this.value = value;
        this.forrige = forrige;
    }

    public numberNode(int value){
        this.neste =null;
        this.forrige =null;
        this.value =value;
    }

    public numberNode getNeste() {
        return neste;
    }

    public numberNode getForrige() {
        return forrige;
    }

    public int getValue() {
        return value;
    }

    public void setNeste(numberNode neste) {
        this.neste = neste;
    }

    public void setForrige(numberNode forrige) {
        this.forrige = forrige;
    }
}