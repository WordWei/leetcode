/**
 * @author: liwei
 * @create: 2021/1/20 0020
 * @description:
 **/

import java.util.Arrays;

/**
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 *
 * 输入: [1,2,3]
 * 输出: 6
 *
 *
 * 输入: [1,2,3,4]
 * 输出: 24
 *
 */
public class ThreeNumMaxMutiple {


    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        return Math.max(nums[n-1]*nums[n-2]*nums[n-3], nums[0]*nums[1]*nums[n-1]);
    }

}
