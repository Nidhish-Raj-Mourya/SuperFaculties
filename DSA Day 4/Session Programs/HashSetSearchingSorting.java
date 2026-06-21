import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetSearchingSorting {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        // Search using contains()
        System.out.println(
                "Contains 30: " + numbers.contains(30)
        );

        // Convert HashSet into ArrayList for sorting
        List<Integer> sortedNumbers =
                new ArrayList<>(numbers);

        // Sort ascending
        Collections.sort(sortedNumbers);

        System.out.println(
                "Ascending: " + sortedNumbers
        );

        // Sort descending
        sortedNumbers.sort(Collections.reverseOrder());

        System.out.println(
                "Descending: " + sortedNumbers
        );
    }
}