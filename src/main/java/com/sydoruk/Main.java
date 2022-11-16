package com.sydoruk;

public class Main {

    public static void main(String[] args) {
        ArrayWork newArray = new ArrayWork();
        final int[] array = newArray.create();
        ArrayWork.printArray(array);
        Lock arrayLock = new Lock(array);
        arrayLock.printArray();
        ArrayWork.printArray(newArray.sort(array));
        ArrayWork.printArray(newArray.thirdPow(array));
        arrayLock.getArray()[0] = 10;
        arrayLock.printArray();
    }
}







