package com.sydoruk;

import java.util.Arrays;

class Lock {

    private final int[] arrayLock;

    protected Lock(int[] array){
        this.arrayLock = Arrays.copyOf(array,array.length);
    }

    protected void printArray(){
        System.out.println("Origin lock array: " + Arrays.toString(arrayLock));
    }

    protected int[] getArray() {
        return Arrays.copyOf(arrayLock,arrayLock.length);
    }
}