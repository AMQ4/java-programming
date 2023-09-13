package challenges.array_list;

import java.util.Comparator;
import java.util.Scanner;

/**
 * This class demonstrates basic operations on an ArrayList of Double values.
 * It allows users to add and remove items from the list and displays the sorted list.
 */
public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Double> arrayList = new java.util.ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                """
                Available Actions:
                
                0 - to shutdown
                
                1 - to add item(s) to the list (comma-delimited list)
                
                2 - to remove any items (comma-delimited list)
                
                Enter a number for which action you want to do: 
                """);

        int response;
        while ((response = Integer.parseInt(scanner.nextLine())) != 0) {
            switch (response) {
                case 0:
                    break;
                case 1:
                    String list = scanner.nextLine();
                    for (String number : list.split(",")) {
                        if (!arrayList.contains(number)) {
                            arrayList.add(Double.parseDouble(number));
                        }
                    }
                    arrayList.sort(Comparator.naturalOrder());
                    System.out.println(arrayList);
                    break;
                case 2:
                    list = scanner.nextLine();
                    for (String number : list.split(",")) {
                        if (arrayList.contains(Double.parseDouble(number))) {
                            arrayList.remove(Double.parseDouble(number));
                        }
                    }
                    System.out.println(arrayList);
                    break;
                default:
                    System.out.println("Invalid number selected.");
            }
        }
    }
}
