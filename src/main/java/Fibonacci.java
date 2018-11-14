/**
 * Name: Fibonacci
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author: wapzjn@gmail.com
 * @date: 2018/11/14 19:52
 */

/**
 * 斐波那契数列
 */
public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacci2(100));
    }

    /**
     * 递归实现
     *
     * @param n
     * @return
     */
    public static long fibonacci(long n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * 非递归实现
     *
     * @param n
     * @return
     */
    public static long fibonacci2(long n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            long f1 = 1L;
            long f2 = 1L;
            long total = f1 + f2;
            for (int i = 2; i < n; i++) {

                f1 = f2;
                f2 = total;
                total = f1 + f2;
            }
            return total;
        }
    }

}
