/**аЭффективно вычислить Fn
 * input: целое число n >= 0
 * output: Fn
 * */
public class FibonacciNumbers {
    private static long fibNum(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[0] = 1;

        for (int i = 2; i <= n; i++) {
            arr[n] = arr[n - 1] + arr[n - 2];
        }

        return arr[n];
    }
}
