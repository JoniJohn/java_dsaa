package com.dsaa;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class InsertionSortTest {
    @Test
    public void insertionSortAscTest(){
        // arrange
        final AllSorting<Integer> sorts = new AllSorting<Integer>();
        Integer[] testArr = { 3, 1, 2 };
        Integer[] expArr = { 1, 2, 3 };
        // act
        Integer[] resArr = sorts.insertionSortAsc(testArr);
        // assert
        assertArrayEquals(expArr, resArr);
    }
    
    @Test
    public void insertionSortDescTest() {
        // arrange
        final AllSorting<Integer> sorts = new AllSorting<Integer>();
        Integer[] testArr = { 3, 1, 2 };
        Integer[] expArr = { 3, 2, 1 };
        // act
        Integer[] resArr = sorts.insertionSortDesc(testArr);
        // assert
        assertArrayEquals(expArr, resArr);
    }
}
