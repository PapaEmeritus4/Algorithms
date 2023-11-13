public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};

        BinarySearch main = new BinarySearch();

        System.out.println(main.binarySearch(array, 9)); //4
        System.out.println(main.binarySearch(array, 1)); //0
        System.out.println(main.binarySearch(array, 30)); //-1
    }

    public int binarySearch(int[] array, int item) {
        if (isListEmpty(array)) {
            return -1;
        }

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];

            if (guessEqualsItem(guess, item)) {
                return mid;
            }
            else if (guessGreaterThanItem(guess, item)) {
                high = mid - 1;
            }
            else if (guessLessThanItem(guess, item)) {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static boolean isListEmpty(int[] myList) {
        int listSize = myList.length;
        if (listSize == 0) {
            return true;
        }
        return false;
    }

    public static boolean guessEqualsItem(int guess, int item) {
        if (guess != item) {
            return false;
        }
        return true;
    }

    public static boolean guessGreaterThanItem(int guess, int item) {
        if (guess < item) {
            return false;
        }
        return true;
    }

    public static boolean guessLessThanItem(int guess, int item) {
        if (guess > item) {
            return false;
        }
        return true;
    }
}
