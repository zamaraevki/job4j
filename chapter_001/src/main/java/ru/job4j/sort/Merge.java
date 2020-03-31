package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while (index1 < left.length && index2 < right.length) {
            if (left[index1] < right[index2]) {
                rsl[index3] = left[index1];
                index1 += 1;
            } else {
                rsl[index3] = right[index2];
                index2 += 1;
            }
            index3 += 1;
        }
        while (index1 < left.length) {
            rsl[index3] = left[index1];
            index1 += 1;
            index3 += 1;
        }
        while (index2 < right.length) {
            rsl[index3] = right[index2];
            index2 += 1;
            index3 += 1;
        }

        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
