package com.robin;

import com.robin.util.BaseUtil;

/**
 * 插入排序
 * Created by biNgo on 2021-02-18.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 7, 9, 6, 1, 2, 4};
        BaseUtil.printArray(arr, "before = ");

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    BaseUtil.swap(arr, j, j + 1);
                }
            }

        }
        BaseUtil.printArray(arr, "after =  ");
    }
}
