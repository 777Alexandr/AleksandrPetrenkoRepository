package com.hillel.lesson5.loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // вывести 100 раз слово "Хелло"

//        for (int i = 0; i <= 100; i++) {
//            System.out.println("Хелло");
//        }

        // вывести последовательность нечётных чисел от 10 до 50

//          for (int i = 11; i <= 50; i = i +2) {
//              System.out.println("Нечётные" + i);
//        }

//        последовательности чисел
          int j = 19;
          int k = 0;
          for (int i = 11; i <= 50; i = i +2) {
              System.out.println("Нечётное " + i + " " + j + " " + k);
              j++;
              k = k + 8;
          }

        // вывести 100 раз слово "Хелло l"
        int l = 0;                                  // for (int l = 0; l<= 100; l++){
        for (; l<= 100; ){                          //     System.out.println("Хелло " + l);
            System.out.println("Хелло " + l);       // }
            l++;

        }

        int u = 0;
        while (u <= 100);
            System.out.println("Хелло " + u);
            u++;

        // вывести целое число пока юзер вводит целое число
        Scanner scaner = new Scanner(System.in);

        while (scaner.hasNextInt()){
            System.out.println("Scanner " + scaner.hasNextInt() );
        }



    }
}
