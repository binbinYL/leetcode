package com.robin;

import com.robin.util.BaseUtil;

/**
 * Created by biNgo on 2021-02-17.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 7, 9, 6, 1, 2, 4};
        BaseUtil.printArray(arr, "before");

        for (int i = 0; i < arr.length - 1; i++) {
            boolean doSwap = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    BaseUtil.swap(arr, i, j);
                    doSwap = true;
                }
            }
            // 如果冒泡没有发生交换，说明数组顺序就是对的，直接返回，时间复杂度就是O(n)
            if (!doSwap) {
                return;
            }
        }
        BaseUtil.printArray(arr, "after");
    }
}
