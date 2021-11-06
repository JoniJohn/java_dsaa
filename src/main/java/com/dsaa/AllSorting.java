package com.dsaa;

public class AllSorting<T extends Comparable<T>> {

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
    public T[] bubbleSortDesc(T[] arr){
        return arr;
    }
    
}
