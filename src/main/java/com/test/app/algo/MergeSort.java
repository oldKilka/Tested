package com.test.app.algo;

/**
 * Класс MergeSort реализует алгоритм сортировки слиянием для сортировки массива целых чисел в порядке возрастания.
 */
public class MergeSort {

    /**
     * Сливает два подмассива исходного массива.
     *
     * @param A исходный массив
     * @param p начальный индекс первого подмассива
     * @param q конечный индекс первого подмассива
     * @param r конечный индекс второго подмассива
     */
    public static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            left[i] = A[p + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = A[q + j + 1];
        }

        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = p; k <= r; k++) {
            if (left[i] <= right[j]) {
                A[k] = left[i];
                i++;
            } else {
                A[k] = right[j];
                j++;
            }
        }
    }

    /**
     * Рекурсивно сортирует подмассив исходного массива.
     *
     * @param A исходный массив
     * @param p начальный индекс подмассива, который нужно отсортировать
     * @param r конечный индекс подмассива, который нужно отсортировать
     */
    public static void sort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(A, p, q);
            sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    /**
     * Точка входа в приложение MergeSort.
     * Создает массив целых чисел и сортирует его с использованием алгоритма сортировки слиянием.
     * Выводит отсортированный массив.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int[] A = {5, 2, 4, 6, 1, 3, 2, 6};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(A, 0, A.length - 1);

        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
