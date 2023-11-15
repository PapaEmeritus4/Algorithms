import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortBySelection {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr)); //[2, 3, 5, 6, 10]
    }

    public static int findSmallest(List<Integer> array) {
        int smallest = array.get(0);
        int smallestIndex = 0;

        for (int i = 0; i <array.size(); i++) {
            if (array.get(i) < smallest) {
                smallest = array.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static List<Integer> selectionSort(List<Integer> array) {
        List<Integer> newArray = new ArrayList<>(array.size());

        int size = array.size();
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(array);
            newArray.add(array.get(smallest));

            array.remove(smallest);
        }
        return newArray;
    }
}
