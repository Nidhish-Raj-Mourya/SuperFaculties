import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSearchingSorting {

    public static void main(String[] args) {

        List<Integer> numbers =
                new ArrayList<>(List.of(40, 10, 30, 20, 50));

        // Sort in ascending order
        Collections.sort(numbers);

        System.out.println("Ascending: " + numbers);

        // Binary search
        // List must be sorted before binarySearch()
        int index = Collections.binarySearch(numbers, 30);

        System.out.println("30 found at index: " + index);

        // Search using contains()
        boolean contains20 = numbers.contains(20);

        System.out.println("Contains 20: " + contains20);

        // Find first index
        System.out.println(
                "Index of 40: " + numbers.indexOf(40)
        );

        // Sort in descending order
        numbers.sort(Collections.reverseOrder());

        System.out.println("Descending: " + numbers);

        // Search using stream
        boolean found = numbers.stream()
                .anyMatch(number -> number == 50);

        System.out.println("Contains 50: " + found);
    }
}