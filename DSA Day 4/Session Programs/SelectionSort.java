import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {64, 25, 12, 22, 11};

        System.out.println("Before sorting: "
                + Arrays.toString(numbers));

        selectionSort(numbers);

        System.out.println("After sorting:  "
                + Arrays.toString(numbers));
    }

    static void selectionSort(int[] numbers) {

        for (int index = 0; index < numbers.length - 1; index++) {

            int minimumIndex = index;

            for (int next = index + 1;
                 next < numbers.length;
                 next++) {

                if (numbers[next] < numbers[minimumIndex]) {
                    minimumIndex = next;
                }
            }

            int temporary = numbers[index];
            numbers[index] = numbers[minimumIndex];
            numbers[minimumIndex] = temporary;
        }
    }
}