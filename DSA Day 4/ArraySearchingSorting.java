import java.util.Arrays;

public class ArraySearchingSorting {

    public static void main(String[] args) {

        int[] numbers = {40, 10, 30, 20, 50};

        // Sort complete array
        Arrays.sort(numbers);

        System.out.println(
                "Sorted array: " + Arrays.toString(numbers)
        );

        // Binary search
        // Array must be sorted before binarySearch()
        int index = Arrays.binarySearch(numbers, 30);

        if (index >= 0) {
            System.out.println("30 found at index: " + index);
        } else {
            System.out.println("30 not found");
        }

        // Search using stream
        boolean contains40 = Arrays.stream(numbers)
                .anyMatch(number -> number == 40);

        System.out.println("Contains 40: " + contains40);

        // Sort only a selected range
        int[] rangeArray = {50, 40, 30, 20, 10};

        Arrays.sort(rangeArray, 1, 4);

        System.out.println(
                "Range sorted array: "
                        + Arrays.toString(rangeArray)
        );
    }
}