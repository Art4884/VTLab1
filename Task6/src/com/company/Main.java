package com.company;

public class Main {

    private static void shiftToLeft(int[] array){
        int border = array.length;
        int tmp = array[0];
        System.arraycopy(array, 1, array, 0, border - 1);
        array[border - 1] = tmp;
    }

    private static int[][] formMatrix(int[] array){
        int[][] matrix = new int[array.length][array.length];
        for(int i = 0; i < array.length; i++){
            System.arraycopy(array, 0, matrix[i], 0, array.length);
            shiftToLeft(array);
        }
        return matrix;
    }

    private static void readMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = formMatrix(array);
        readMatrix(matrix);
    }
}
