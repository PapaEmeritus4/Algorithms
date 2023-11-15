import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(quickSort(Arrays.asList(10,5,2,3)));
    }

    public static List<Integer> quickSort(List<Integer> array) {
        if (array.size() < 2) {
            return array;
        } else {
            Integer supportElement = array.get(0);

            List<Integer> less = array.stream().skip(1).filter(e1 -> e1 <= supportElement)
                    .collect(Collectors.toList());

            List<Integer> greater = array.stream().skip(1).filter(e1 -> e1 > supportElement)
                    .collect(Collectors.toList());

            return Stream.of(
                    quickSort(less).stream(),
                    Stream.of(supportElement),
                    quickSort(greater).stream()).
                    flatMap(Function.identity()).
                    collect(Collectors.toList());
        }
    }
}
