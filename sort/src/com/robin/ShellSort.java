package com.robin;

import com.robin.util.BaseUtil;

/**
 * 希尔排序
 * 改进的插入排序（间隔大时移动的次数少，间隔小时移动的距离短–所以加快了效率）
 *
     平均时间复杂度	最坏时间复杂度	最好时间复杂度	空间复杂度	稳定性
     n1.3	n²	n	1	不稳定
 *
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        BaseUtil.printArray(arr, "before=");

        int h = 1;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }
        System.out.println("h=" + h);
        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            System.out.println("gap=" + gap);
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (arr[j] < arr[j - gap]) {
                        BaseUtil.swap(arr, j, j - gap);
                    }
                }
            }
        }

        BaseUtil.printArray(arr, "after=");
    }
}
