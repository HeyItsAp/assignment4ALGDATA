import heyitsap.random.numberList;

import java.util.ArrayList;

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

public static void main(String[] args) {
    numberList a = numberList.fromString("99999999999999999999999999");
    numberList b = numberList.fromString("1");

    a.getFullList();
    System.out.println(" ");
    b.getFullList();

    numberList sum = a.additionWithAnotherList(b);
    sum.getFullList();
}


