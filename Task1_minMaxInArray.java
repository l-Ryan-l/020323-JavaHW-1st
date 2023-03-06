// Task 1: Задать одномерный массив и найти в нем минимальный и максимальный элементы

import java.sql.Array;

public class Task1_minMaxInArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr);
        printArray(arr);
        System.out.println("Max = " + findMax(arr));
        System.out.println("Min = " + findMin(arr));

    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random()*10));
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("");
    }

    public static Integer findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static Integer findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }


}
