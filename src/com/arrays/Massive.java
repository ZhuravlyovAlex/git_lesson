package com.arrays;
import java.util.Arrays;
public class Massive {
    public static void main(String[] args) {
        int [] arrays = new int[]{12, 6, 12, 5};
        for(int i = 0; i < arrays.length; i++) {
            System.out.println("ячейка " + (i + 1) + " содержит число: " + arrays[i]);
        }
        System.out.println("");
        int[] second = Arrays.copyOf(arrays, arrays.length);
        Arrays.sort(second);
        for(int i = 0; i < second.length; i++)
        System.out.print(second[i] + " ");
    }
}
