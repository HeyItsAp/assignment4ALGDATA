
import heyitsap.random.numberList;

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



private static numberList getListFromNumber(Long longNumber){
    numberList list = new numberList();
    List<Integer> digits = new ArrayList<Integer>();
    while (longNumber > 0){
        Long digit = longNumber % 10;
        digits.add(Math.toIntExact(digit));
        longNumber = longNumber / 10;
    }
    Collections.reverse(digits);
    digits.stream().forEach(x -> list.add(x));
    return list;
}

public class Main {
    public static void main(String[] args) {
        numberList a = numberList.fromString("99999999999999999999999999");
        numberList b = numberList.fromString("1");

        List.getFullList();
        System.out.println(" ");
        List2.getFullList();

        numberList sum = a.additionWithAnotherList(b);
        sum.getFullList();
    }
}
