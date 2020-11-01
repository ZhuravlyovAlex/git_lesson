package com.itProger;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
         do {
            System.out.print("Введите число 5: ");
            num = sc.nextInt();
        }  while (num != 5);
        System.out.println("Вы молодей!");
    }
}
