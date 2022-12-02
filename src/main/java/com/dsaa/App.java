package com.dsaa;

/**
 * Hello world!
 *
 */
public class App {

    static void printArray(Integer[] arr) {
        String strArray = "{";

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                strArray += arr[i].toString();
            } else {
                strArray += ", " + arr[i].toString();
            }
        }

        strArray += "}";

        System.out.println(strArray);
    }

    public static void main(String[] args) {
        // insertion Sort debug
        AllSorting<Integer> sorts = new AllSorting<Integer>();
        Integer[] arr = { 3, 1, 1, 2, 4 };
        printArray(arr);
        sorts.selectionSortDesc(arr);
        printArray(arr);
    }
}
