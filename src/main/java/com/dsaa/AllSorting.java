package com.dsaa;

public class AllSorting<T extends Comparable<T>> {
    /**
     * Sorts array using the Bubble Sort algorithm in ascending order
     * 
     * @param arr
     * @return
     */
    public T[] bubbleSortAsc(T[] arr) {
        T temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // if not in order
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    // perfom a swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Sorts array using the Bubble Sort algorithm in descinding order
     * 
     * @param arr
     * @return
     */
    public T[] bubbleSortDesc(T[] arr) {
        T temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // if not in order
                if (arr[i].compareTo(arr[i + 1]) < 0) {
                    // perfom a swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Sorts array using Insertion Sort algorithm in ascending order
     * 
     * @param arr
     * @return
     */
    public T[] insertionSortAsc(T[] arr) {
        T temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    // perform a swap
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    /**
     * Sorts array using Insertion Sort algorithm in descinding order
     * 
     * @param arr
     * @return
     */
    public T[] insertionSortDesc(T[] arr) {
        T temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1].compareTo(arr[j]) < 0) {
                    // perform a swap
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    /**
     * Sorts array using Selection Sort algorithm in ascending order
     * 
     * @param arr
     * @return
     */
    public T[] selectionSortAsc(T[] arr) {
        int smallest = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[smallest]) < 0) {
                    smallest = j;
                    flag = true;
                }
            }
            // if smallest has changed swap
            if (flag) {
                T temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;

            }
            flag = false;
            smallest = i + 1;

        }
        return arr;
    }

    /**
     * Sorts an array using Selection Sort algorithm in descending order
     * 
     * @param arr
     * @return
     */
    public T[] selectionSortDesc(T[] arr) {
        int largest = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[largest]) > 0) {
                    largest = j;
                    flag = true;
                }
            }
            // if largest has changed swap
            if (flag) {
                T temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
            }
            flag = false;
            largest = i + 1;

        }
        return arr;
    }

}
