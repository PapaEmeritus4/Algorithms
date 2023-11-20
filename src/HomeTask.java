import javax.management.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * тут будут дз по книге
 * */

public class HomeTask {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};

        System.out.println(sum(array)); //10
        System.out.println(recurseSum(array)); //10
        System.out.println(biggestNumber(array)); //4

    }

    //4.1
    public static int sum(int[] array) {
        int total = 0;

        for (int i = 0; i <array.length + 1 ; i++) {
            total += i;
        }
        return total;
    }

    //4.2 рекурсивная функция для подсчета сумы элементов в списке
    public static int recurseSum(int[] array) {
        int total = 0;
        int size = array.length;

        if (size == 0) {  
            return 0;
        }
        else {
            total += (sum(array));
        }
        return total;
    }

    //4.3 найбольшее число в списке
    public static int biggestNumber(int[] array) {
        int total = 0;

        for (int i = 0; i < array.length + 1; i++) {
            if (i > total) {
                total = i;
            }
        }
        return total;
    }
}
