import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] numbers = {10, 7, 8, 9, 1, 5};

        System.out.println("Before sorting: "
                + Arrays.toString(numbers));

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("After sorting:  "
                + Arrays.toString(numbers));
    }

    static void quickSort(int[] numbers, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(numbers, low, high);

            quickSort(numbers, low, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, high);
        }
    }

    static int partition(int[] numbers, int low, int high) {

        int pivot = numbers[high];
        int smallerElementIndex = low - 1;

        for (int currentIndex = low;
             currentIndex < high;
             currentIndex++) {

            if (numbers[currentIndex] < pivot) {

                smallerElementIndex++;

                swap(
                        numbers,
                        smallerElementIndex,
                        currentIndex
                );
            }
        }

        swap(numbers, smallerElementIndex + 1, high);

        return smallerElementIndex + 1;
    }

    static void swap(int[] numbers, int first, int second) {

        int temporary = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temporary;
    }
}