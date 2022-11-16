package com.sydoruk;

import java.util.Arrays;

public class Lock {

    private final int[] arrayLock;

    public Lock(int[] array){
        this.arrayLock = Arrays.copyOf(array,array.length);
    }

    public void printArray(){
        System.out.println("Origin lock array: " + Arrays.toString(arrayLock));
    }

    public int[] getArray() {
        return Arrays.copyOf(arrayLock,arrayLock.length);
    }
}