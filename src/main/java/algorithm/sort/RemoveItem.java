package algorithm.sort;

import java.util.Arrays;

/**
 * RemoveItem
 * @author lee
 * @version 1.0
 * @description 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素
 * https://leetcode.cn/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
 * @date 2023年10月26日 09:14:00
 */
public class RemoveItem {
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 1;
        int i = removeElement(nums, val);
        System.out.println(i);

    }
}
