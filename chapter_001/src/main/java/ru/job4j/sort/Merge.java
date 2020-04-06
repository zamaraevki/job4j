package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int ileft = 0;
        int iright = 0;
        int iresult = 0;
        while (iresult < rsl.length) {
            if (ileft < left.length && iright < right.length) {
                rsl[iresult++] = left[ileft] <= right[iright] ? left[ileft++] : right[iright++];
            } else if (ileft < left.length) {
                rsl[iresult++] = left[ileft++];
            } else {
                rsl[iresult++] = right[iright++];
            }
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
