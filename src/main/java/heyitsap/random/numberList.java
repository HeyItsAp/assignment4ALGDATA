package heyitsap.random;

class numberList{
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

    public void additionWithAnotherList(numberList otherList){
        numberNode haleOrignal = hale;
        numberNode haleOther = otherList.getTail();
        StringBuilder numberString = new StringBuilder();
        int rest = 0;
        while( haleOrignal != null && haleOther != null){
            int sum = haleOrignal.getValue() + haleOther.getValue() + rest;
            rest = sum / 10;
            numberString.append(sum%10); haleOrignal = haleOrignal.getForrige(); haleOther = haleOther.getForrige();
        }
        System.out.println(numberString);
    }

    public numberNode getHead() {
        return hode;
    }

    public numberNode getTail() {
        return hale;
    }
}
