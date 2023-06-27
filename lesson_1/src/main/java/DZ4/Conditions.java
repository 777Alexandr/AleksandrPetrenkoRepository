package DZ4;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

//        Задача 1.
//        Во многих странах для измерения небольших размеров используется не только
//        единица длины «сантиметр», но и такая единица, как «дюйм» (1 дюйм = 2.54 сантиметра).
//        Выведите в консоль 10 см,равное размеру в дюймах,и затем 25 дюймов,но в сантиметрах.


        double cm = 10;
        double inches = cm/2.54;
        System.out.println("10 см = " + inches + " дм");
        inches = 25;
        cm = inches*2.54;
        System.out.println("25 дм = " + cm + "см");

        System.out.println("---------------------------");


//        Задача 2.
//        Подрабатывая в течение года, Вася собрал себе определенную сумму на поездку за границу,
//        а родители добавили ему от себя еще некоторую сумму.
//        Выведите в консоль сколько денег есть у Васи на отпуск (в евро) если:
//        Вася заработал 5000 грн,Родители добавили-5000, курс евро 1 евро = 28 грн.

        Scanner s = new Scanner(System.in);
        System.out.print("Ввести заработанную сумму: ");
        int a = s.nextInt();
        System.out.print("Ввести подаренную сумму: ");
        int b = s.nextInt();
        System.out.print("Ввести курс евро к гривне: ");
        double exchange = s.nextDouble();
        double sum = (a+b)/exchange;
        System.out.println("Сумма на отпуск: " + sum + " EUR");
        System.out.println("---------------------------");


//        Задача 3.
//        Если x любое положительное двузначное число
//        Выведите на екран его десятки и еденицы (2 числа)
//        разделенные знаком «пробел», но в обратном порядке.
//        То есть для числа 45 будет выведено на экран 5 4.


        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести двузначное положительное число: ");
        int x = sc.nextInt();
        if (x>9 && x<100) {
            int ed = x % 10;
            int des = x / 10;
            System.out.println(ed + " " + des);
        } else {
            System.out.println("Введённое число не соответствует условию ");
        }

        System.out.println("---------------------------");

//        Задача 4.
//        Если x любое положительное двузначное число
//        Выведите на екран его в «полном виде»: например, для числа 34 это будет выглядеть как 30+4.

        Scanner sca = new Scanner(System.in);
        System.out.println("Ввести любое положительное двузначное число: ");
        int h = sca.nextInt();
        if (h>9 && h<100) {
            int des = h / 10;
            int ed = h % 10;
            System.out.println(des* 10 + "+" + ed);
        } else {
            System.out.println("Введённое число не соответствует условию ");
        }

        System.out.println("---------------------------");


//        Задача 5.
//        Назовем весом числа сумму его цифр.
//        Если x любое положительное двузначное число
//        Выведите на екран его «вес».

        Scanner scan = new Scanner(System.in);
        System.out.println("Ввести любое положительное двузначное число для вычисления веса :");
        int m = scan.nextInt();
        if (m>9 && m<100) {
            int des = m / 10;
            int ed = m % 10;
            int weight = des + ed;
            System.out.println("Вес = " + weight);
        } else {
            System.out.println("Введённое число не соответствует условию ");
        }

        System.out.println("---------------------------");

//        Задача 6.
//        Если x любое число,выведите на экран одно из следующих сообщений:
//        Положительное, или Отрицательное, или Ноль, -в зависимости от значения числа.

        Scanner scann = new Scanner(System.in);
        System.out.println("Ввести число :");
        int numb = scan.nextInt();
        if (numb > 0){
            System.out.println("число положительное");
        } else if (numb < 0){
            System.out.println("число отрицательное");
        } else {
            System.out.println("Введённое число = 0");
        }

        System.out.println("---------------------------");


//        Задача 7.
//        Если x любое число,
//        если оно как минимум трехзначное и положительное, уменьшает его на 1 и выводит на экран.

        Scanner scanne = new Scanner(System.in);
        System.out.println("Ввести любое число минимум трёхзначное (положительное: ");
        int p = scanne.nextInt();
        if (p>=100) {
            p = p - 1;
            System.out.println(p);
        } else {
            System.out.println("Введённое число не соответствует условию ");
        }

        System.out.println("---------------------------");

//        Задача 8.
//        Если x любое положительное двузначное число выведите на экран что больше:
//        само это число или произве­дение его цифр.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести любое положительное двузначное число: ");
        int o = scanner.nextInt();
        if(o>9 & o<100){
            int des = o / 10;
            int ed = o % 10;
            int mult = des * ed;
            System.out.println(mult);
            if(mult>o){
                System.out.println("произведение цифр из числа" + o + " больше чем само число");
            } else {
                System.out.println("Число" + o + "больше произведения его цифр");
            }
        }



        s.close();
        sc.close();
        sca.close();
        scan.close();
        scann.close();
        scanne.close();
        scanner.close();




    }
}
