package com.robin;

import com.robin.util.BaseUtil;

/**
 * 选择排序
 * Created by biNgo on 2021-02-15.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 7, 9, 6, 1, 2, 4};
        BaseUtil.printArray(arr, "before=");

        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPosition]) {
                    minPosition = j;
                }
            }
            BaseUtil.swap(arr, i, minPosition);
        }

        BaseUtil.printArray(arr, "after=");
    }
}
