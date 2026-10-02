package heyitsap.random;

class treNode {
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

class tre{
    private treNode rot;

    public tre (treNode rot){
        this.rot = rot;
    }
}
class numberList{
    private numberNode head; // As in ###X not X###.
    private numberNode tail;

    /**
     * Creates the linked list based on number.
     */
    public numberList(){
        this.head = null;
        this.tail = null;
    }

    public void add(int value){
        numberNode nyNode = new numberNode(value);

        if (head == null) {
            head = nyNode;
            tail = nyNode;
        } else {
            nyNode.setForrige(tail);
            tail.setNeste(nyNode);
            tail = nyNode;
        }
    }

    public void printOutNumber(){
        numberNode forrige = null;
        StringBuilder numberString = new StringBuilder();
        for (numberNode e = head; e != null; e = e.getNeste()){
            numberString.append(e.getValue());
        }
        numberString.reverse();
        System.out.println(numberString);
    }

    public void additionWithAnotherList(numberList otherList){
        while ()
    }

    public numberNode getHead() {
        return head;
    }

    public numberNode getTail() {
        return tail;
    }
}
class numberNode {
    // Or just use ArrayList
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


public class Main {
    public static void main() {
        int LongNumber = 987654321;
        numberList list = new numberList();

        while (LongNumber > 0){
            int digit = LongNumber % 10;
            System.out.println(digit);
            list.add(digit);
            LongNumber = LongNumber / 10;
        }
        list.printOutNumber();
    }
}
