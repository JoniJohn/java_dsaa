package com.dsaa;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void selectionIntegerSortAsc() {

        final AllSorting<Integer> aSorting = new AllSorting<Integer>();
        Integer[] testArr = { 3, 1, 2 };
        Integer[] expArr = { 1, 2, 3 };

        Integer[] resArr = aSorting.selectionSortAsc(testArr);

        assertArrayEquals(expArr, resArr);
    }

    @Test
    public void selectionStringSortAsc() {

        final AllSorting<String> aSorting = new AllSorting<String>();
        String[] testArr = { "John", "Jo", "Joh" };
        String[] expArr = { "Jo", "Joh", "John" };

        String[] resArr = aSorting.selectionSortAsc(testArr);

        assertArrayEquals(expArr, resArr);
    }

    @Test
    public void selectionIntegerSortDesc() {
        final AllSorting<Integer> aSorting = new AllSorting<Integer>();
        Integer[] testArr = { 3, 1, 2 };
        Integer[] expArr = { 3, 2, 1 };

        Integer[] resArr = aSorting.selectionSortDesc(testArr);

        assertArrayEquals(expArr, resArr);
    }

    @Test
    public void selectionStringSortDesc() {
        final AllSorting<String> aSorting = new AllSorting<String>();
        String[] testArr = { "John", "Jo", "Joh" };
        String[] expArr = { "John", "Joh", "Jo" };

        String[] resArr = aSorting.selectionSortDesc(testArr);

        assertArrayEquals(expArr, resArr);
    }
}
