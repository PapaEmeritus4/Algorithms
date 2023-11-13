/**аЭффективно вычислить Fn
 * input: целое число n >= 0
 * output: Fn
 * */
public class FibonacciNumbers {
    public long fibNum(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}
