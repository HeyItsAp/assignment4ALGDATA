package heyitsap.random;

import java.util.ArrayList;

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

private numberList getListFromNumber(int longNumber){
    numberList list = new numberList();
    List<Integer> digits = new ArrayList<Integer>();
    while (longNumber > 0){
        int digit = longNumber % 10;
        digits.add(digit);
        longNumber = longNumber / 10;
    }
    Collections.reverse(digits);
    digits.stream().forEach(x -> list.add(x));
    return list;
}

public class Main {
    public static void main() {
        int LongNumber = 987654321;

        while (LongNumber > 0){
            int digit = LongNumber % 10;
            list.add(digit);
            LongNumber = LongNumber / 10;
        }


        list.getFullList();
        System.out.println(" ");
        list2.getFullList();
        list.additionWithAnotherList(list2);
    }
}
