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
        // arrange for repeating numbers
        Integer[] testRepArr = { 3, 1, 1,  2 };
        Integer[] expRepArr = { 1, 1, 2, 3 };
        // act
        Integer[] resRepArr = sorts.insertionSortAsc(testRepArr);
        // assert
        assertArrayEquals(expRepArr, resRepArr);
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
        // arrange for repeating numbers
        Integer[] testRepArr = { 3, 1, 1, 2 };
        Integer[] expRepArr = { 3, 2, 1, 1 };
        // act
        Integer[] resRepArr = sorts.insertionSortDesc(testRepArr);
        // assert
        assertArrayEquals(expRepArr, resRepArr);
    }
}
