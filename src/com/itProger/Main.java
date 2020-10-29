package com.itProger;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        char symbol = in.next().charAt(3);
        System.out.println(symbol);

    }
}
