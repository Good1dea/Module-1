package com.sydoruk;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayWork {

    private int userChoice;
    private int arrayLength;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    protected int[] create(){
        do {
            System.out.println("Write the size of the array more than 10 elements");
            if (scanner.hasNextInt()) {
                arrayLength = scanner.nextInt();
            } else {
                System.out.println("Incorrect value, enter an integer greater than 10");
                scanner.next();
            }
        } while (arrayLength < 10);
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 101);
        }
        return array;
    }

    protected int[] sort(int[] array) {
        do {
            System.out.println("Write 0 to select ascending array sorting or 1 to select descending array sorting");
            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();
            } else {
                System.out.println("Incorrect value, enter 0 or 1");
                scanner.next();
            }
        } while (userChoice < 0 || userChoice > 1);
        if (userChoice == 0) {
            boolean change = true;
            while (change) {
                change = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        int min = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = min;
                        change = true;
                    }
                }
            }
            System.out.println("Ascending sorted array:");
        }
        if (userChoice == 1) {
            boolean change = true;
            while (change) {
                change = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        int max = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = max;
                        change = true;
                    }
                }
            }
            System.out.println("Descending sorted array:");
        }
        return array;
    }

    protected int[] thirdPow(int[] array){
        System.out.println("Raise every third element of the array to the third power:");
        for (int i = 2; i < array.length; i+=3) {
            array[i] = (int) Math.pow(array[i], 3);
        }
        return array;
    }

    protected static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}