package com.dsaa;

public class AllSorting<T extends Comparable<T>> {
    /** Sorts array @param arr in ascending order using bubble sort algorithm */
    public T[] bubbleSortAsc(T[] arr){
        T temp;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                // if not in order
                if ( arr[i].compareTo(arr[i+1]) > 0){
                    // perfom a swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    /** Sorts array @param arr in as desceding order using bubble sort algorithm */
    public T[] bubbleSortDesc(T[] arr){
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
    
}
