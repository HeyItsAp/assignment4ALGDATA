import heyitsap.random.numberList;
import heyitsap.random.tre;

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
    // ==== Part 1: Linked List =====
    numberList a = numberList.fromString("99999999999999999999999999");
    numberList b = numberList.fromString("1");

    a.getFullList();
    System.out.println(" ");
    b.getFullList();

    numberList sum = a.additionWithAnotherList(b);
    System.out.println(" ");
    sum.getFullList();
    System.out.println(" ");

    // ==== Part 2: Binary Search treee (with words) ====
    tre BinaryWordTre = new tre();
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter a random ammount of words with a space inbetween:");
    String line = scanner.nextLine();
    for (String word : line.trim().split("\\s+")){
        BinaryWordTre.insert(word);
    }
    System.out.println(BinaryWordTre.toString());
}


