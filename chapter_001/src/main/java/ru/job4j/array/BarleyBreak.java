package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = index;
                index += 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
