package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int min = 0;
        int index = 0;
        for (int i = 0; i < data.length ; i++) {
            min = MinDiapason.findMin(data, i, data.length - 1);
            index = FindLoop.indexOf(data, min, i, data.length - 1);
            data[index] = data[i];
            data[i] = min;
        }
        return data;
    }
}
