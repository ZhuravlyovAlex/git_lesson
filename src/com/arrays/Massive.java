package com.arrays;
import java.util.Arrays;
import java.util.ArrayList;
public class Massive {
    public static void main(String[] args) {
//        int [] arrays = new int[]{12, 6, 12, 5};
//        for(int i = 0; i < arrays.length; i++) {
//            System.out.println("ячейка " + (i + 1) + " содержит число: " + arrays[i]);
//        }
//        System.out.println("");
//        int[] second = Arrays.copyOf(arrays, arrays.length);
//        Arrays.sort(second);
//        for(int i = 0; i < second.length; i++)
//        System.out.print(second[i] + " ");

//        int[][] big_nums = new int[][]{{5,7,1,234},{2,3,8,122},{543,9,0,4},{56,98,6,0}};
//        for(int i = 0; i < big_nums.length; i++) {
//            for (int j = 0; j < big_nums[i].length; j++) {
//                System.out.print(big_nums[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//    ArrayList<String> names = new ArrayList<>();
//    names.add("Борис");
//    names.add("Виктор");
//    names.add("Фёдор");
//    names.add("Аня");
//    names.add("Вика");
//    names.add("Серёжа");
//    for(String el : names)
//        System.out.println(el);
        int num = 0;
        while (num < 10){
            if (num == 5)
                break;
            if((num % 2) == 0){
                num++;
                continue;

            }
            System.out.println(num);
            num++;
        }
    }
}
