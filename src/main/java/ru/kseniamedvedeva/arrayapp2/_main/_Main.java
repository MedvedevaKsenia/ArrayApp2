package ru.kseniamedvedeva.arrayapp2._main;

import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
        int[] intArray = new int[4];
        System.out.println("Our array:");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(intArray));
    }
}