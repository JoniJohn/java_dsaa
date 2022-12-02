package com.dsaa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // insertion Sort debug
       AllSorting<Integer> sorts = new AllSorting<Integer>();
       Integer[] arr = {3,1,1,2};
       sorts.insertionSortDesc(arr); 
    }
}
