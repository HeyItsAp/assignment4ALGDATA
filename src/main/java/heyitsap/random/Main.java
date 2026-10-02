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
