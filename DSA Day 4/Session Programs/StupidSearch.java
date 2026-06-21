public class StupidSearch {

    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == target) {
                return i; // Return the index where target is found
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {

        int[] numbers = {10, 25, 30, 45, 50};
        int target = 30;

        int result = linearSearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}