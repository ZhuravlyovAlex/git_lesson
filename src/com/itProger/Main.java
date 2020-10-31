package com.itProger;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        byte num = 15;
        switch(num) {
            case 1:
                System.out.println("один");
                break;
            case 15:
                System.out.println("пятнадцать");
                break;
            default:
                System.out.println("всякая фигня");
        }

        short x = 15, a = 12;
         int res = x < a ? (x + a) : (x - a);
        System.out.println(res);

        System.out.println("Введите свой возраст: ");
       Scanner in = new Scanner(System.in);
       int age = in.nextInt();
       if(age < 18){
           System.out.println("Вы еще слишком малы");
       }else if(age == 18){
           System.out.println("Вам уже 18");
       }else{
           if(age < 50)
                System.out.println("Вам меньше 50 лет");
           else
               System.out.println("Вам больше 50 лет");
       }

    }
}
