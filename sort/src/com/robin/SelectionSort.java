package com.robin;

/**
 * 选择排序
 * Created by biNgo on 2021-02-15.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 7, 9, 6, 1, 2, 4};
        String str1 = "";
        for (int i = 0; i < arr.length; i++) {
            str1 = str1 + arr[i] + ",";
        }
        System.out.println("arr before sort = " + str1.substring(0, str1.length() - 1));

        for (int i = 0; i < arr.length; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    minPosition = j;
                    int temp = arr[i];
                    arr[i] = arr[minPosition];
                    arr[minPosition] = temp;
                }
            }
        }
        String str2 = "";
        for (int i = 0; i < arr.length; i++) {
            str2 = str2 + arr[i] + ",";
        }
        System.out.println("arr after  sort = " + str2.substring(0, str2.length() - 1));
    }
}
