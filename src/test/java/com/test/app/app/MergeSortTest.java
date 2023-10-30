package com.test.app.app;

import com.test.app.algo.MergeSort;
import org.junit.jupiter.api.Test;

import static com.test.app.algo.MergeSort.merge;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    void testMerge() {
        int[] A = {3, 5, 7, 1, 2, 4};
        MergeSort.merge(A, 0, 2, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 7}, A);

        int[] B = {6, 8, 1, 2};
        MergeSort.merge(B, 0, 1, 3);
        assertArrayEquals(new int[]{1, 2, 6, 8}, B);

        int[] C = {1, 2, 3};
        MergeSort.merge(C, 0, 0, 2);
        assertArrayEquals(new int[]{1, 2, 3}, C);

        int[] D = {5, 4};
        MergeSort.merge(D, 0, 0, 1);
        assertArrayEquals(new int[]{4, 5}, D);
    }

    @Test
    void testSort() {
        int[] A = {3, 5, 7, 1, 2, 4};
        MergeSort.sort(A, 0, A.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 7}, A);

        int[] B = {6, 8, 1, 2};
        MergeSort.sort(B, 0, B.length - 1);
        assertArrayEquals(new int[]{1, 2, 6, 8}, B);

        int[] C = {1, 2, 3};
        MergeSort.sort(C, 0, C.length - 1);
        assertArrayEquals(new int[]{1, 2, 3}, C);

        int[] D = {5, 4};
        MergeSort.sort(D, 0, D.length - 1);
        assertArrayEquals(new int[]{4, 5}, D);
    }
}
