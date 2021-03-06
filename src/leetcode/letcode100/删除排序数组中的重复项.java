package leetcode.letcode100;

/**
 * @author zhangsy
 * @date 2020/9/7 14:59
 */

import java.util.*;

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。


 示例 1:

 给定数组 nums = [1,1,2],

 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。

 你不需要考虑数组中超出新长度后面的元素。
 示例 2:

 给定 nums = [0,0,1,1,1,2,2,3,3,4],

 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。

 你不需要考虑数组中超出新长度后面的元素。

 */
public class 删除排序数组中的重复项 {

    public static void main(String[] args) {
        int[] array = {1,1,2};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return 1;

        int a = 0,b = 1;
        while (b < nums.length){
            if(nums[a]!=nums[b]){
                if(b-a>1) {
                    nums[a + 1] = nums[b];
                }
                a++;
            }
            b++;
        }
        System.out.println(Arrays.toString(nums));
        return a+1;
    }
}
