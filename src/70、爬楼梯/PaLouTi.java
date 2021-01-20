/**
 * @author: liwei
 * @create: 2021/1/20 0020
 * @description:
 **/

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 *
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 *
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 *
 *
 */
public class PaLouTi {


    /**
     * 递归，会超时
     * @param n
     * @return
     */
    public int fun(int n) {
        if (n == 1 ) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fun(n-1) + fun(n -2);
    }

    public int climbStairs(int n) {
        return fun(n);
    }


    /**
     * 动态规划不会超时
     * @param n
     * @return
     */
    public int climbStairs1(int n) {

        if (n == 1 ) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }


}
