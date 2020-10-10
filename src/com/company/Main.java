package com.company;


public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{9, 1, 3, 5, 4, 6, 7, 4, 32};
        int count = 0;
        int maxCount = 0;

        System.out.print("source array:");
        for (int i = 0; array.length > i; i++) {
            count++;
            if (array[i] > maxCount) {
                maxCount = array[i];
            }
            System.out.print(" " + array[i]);
        }
        System.out.println();

        // Sort bubble
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }

        // median? may be wrong
        Double sum = 0.0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }

        System.out.println("number element in array: " + count);
        System.out.println("max element in array: " + maxCount);
        System.out.print("Sort bubble:");

        for (int i = 0; array.length > i; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.println("median: " + sum / array.length);

    }
}
