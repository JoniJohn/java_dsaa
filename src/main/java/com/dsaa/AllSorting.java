package com.dsaa;

public class AllSorting<T extends Comparable<T>> {
   /**
    * Sorts array using the Bubble Sort algorithm in ascending order
    * @param arr
    * @return
    */
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
    
    /**
     * Sorts array using the Bubble Sort algorithm in descinding order
     * @param arr
     * @return
     */
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

    /**
     * Sorts array using Insertion Sort algorithm in ascending order
     * @param arr
     * @return
     */
    public T[] insertionSortAsc(T[] arr){ 
        T temp;  
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j-1].compareTo(arr[j]) > 0){
                    // perform a swap
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }  
        return arr;
    }
    
    /**
     * Sorts array using Insertion Sort algorithm in descinding order
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
    
}
