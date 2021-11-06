package com.dsaa;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortsTest {
    @Test
    public void SortIntergersArrayAsc(){
        // arrange
        final AllSorting<Integer> sorts = new AllSorting<Integer>();
        Integer[] testArr = {3, 1, 2};
        Integer[] expArr = {1, 2, 3};
        // act
        Integer[] resArr = sorts.bubbleSortAsc(testArr);
        // assert
        assertArrayEquals(expArr, resArr);
    }
    @Test
    public void SortIntergersArrayDesc(){
    }
}
