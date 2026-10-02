package heyitsap.random;

public class numberList{
    private numberNode hode; // As in ###X not X###.
    private numberNode hale;

    /**
     * Creates the linked list based on number.
     */
    public numberList(){
        this.hode = null;
        this.hale = null;
    }

    public void getFullList(){
        numberNode node = hode;
        while (node != null) {
            System.out.print(node.getValue() + " <-> ");
            node = node.getNeste();
        }
    }

    public void add(int value){
        numberNode nyNode = new numberNode(value);

        if (hode == null) {
            hode = nyNode;
            hale= nyNode;
        } else {
            nyNode.setForrige(hale);
            hale.setNeste(nyNode);
            hale = nyNode;
        }
    }
    public static numberList fromString(String digits) {
        numberList list = new numberList();
        for (char c : digits.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Not a digit: " + c);
            }
            list.add(c - '0');
        }
        return list;
    }
    public void addFirst(int value) {     // add at the head
        numberNode nyNode = new numberNode(value);
        if (hode == null) {
            hode = hale = nyNode;
        } else {
            nyNode.setNeste(hode);
            hode.setForrige(nyNode);
            hode = nyNode;
        }
    }

    public numberList additionWithAnotherList(numberList otherList){
        numberList result = new numberList();
        numberNode haleOrignal = hale;
        numberNode haleOther = otherList.getTail();
        int rest = 0;

        while( haleOrignal != null || haleOther != null || rest > 0){
            int sum = rest;
            if (haleOrignal != null) { sum += haleOrignal.getValue(); haleOrignal = haleOrignal.getForrige(); }
            if (haleOther != null) { sum += haleOther.getValue(); haleOther = haleOther.getForrige(); }
            result.addFirst(sum % 10);   // prepend, so the order comes out right
            rest = sum / 10;
        }
        return result;
    }

    public numberNode getHead() {
        return hode;
    }

    public numberNode getTail() {
        return hale;
    }
}
