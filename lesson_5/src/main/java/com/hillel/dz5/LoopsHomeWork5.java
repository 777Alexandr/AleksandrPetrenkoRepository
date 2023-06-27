package com.hillel.dz5;

import java.util.Scanner;

public class LoopsHomeWork5 {

    public static void main(String[] args) {

//   Задача 1.
//   Создайте программу, выводящую на экран все четырёхзначные
//   числа последовательности 1000 1003 1006 1009 1012 1015

        for (int i = 1000; i <= 9999; i = i + 3) {    // or  for (int i = 1000; i <= 9999; i += 3) {
            System.out.println("Число " + i);
        }

//   Задача 2.
//   Создайте программу, выводящую на экран
//   все неотрицательные элементы последовательности
//   10, 6, 2,-2,-6,-10

        for (int a = 10; a > 0; a -= 4) {
            System.out.print(a + " ");
        }

//    Задача 3.
//    Создайте программу, вычисляющую факториал натурального числа n,
//    которое пользователь введёт с клавиатуры.
//    https://javarush.ru/groups/posts/klass-scanner
//    Факториал числа n — это произведение натуральных чисел от 1 до n.
//    Обозначается n, произносится «эн-факториал».Например !3 = 1*2*3

        int j;
        long b = 1;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if (scn.hasNextInt()) {
            j = scn.nextInt();
            for (int i = j; i > 0; i--) {
                b *= i;
            }
            System.out.println("Факториал числа " + j + " равен " + b);
        } else System.out.println("Ошибка. Введено не число");


//     Задача 4.
//     Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
//     (заранее не известно сколько цифр будет в числе).

//        int h, c, s, d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int h = scan.nextInt();
        System.out.println("Сумма всех чисел введенного числа равна: " + sumDigits(h));


    }

    public static int sumDigits(int h) {
        int sum = 0;
        while (h != 0){
            sum += h % 10;
            h /= 10;
        }
        return sum;


    }

}
