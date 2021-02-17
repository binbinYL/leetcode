package com.robin.util;

/**
 * Created by biNgo on 2021-02-17.
 */
public class BaseUtil {

    /**
     * 打印数组
     */
    public static void printArray(int[] arr, String desc) {
        String str1 = "";
        for (int i = 0; i < arr.length; i++) {
            str1 = str1 + arr[i] + ",";
        }
        System.out.println(desc + str1.substring(0, str1.length() - 1));
    }

    /**
     * 数组元素交换
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
