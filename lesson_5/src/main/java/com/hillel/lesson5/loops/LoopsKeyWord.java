package com.hillel.lesson5.loops;

public class LoopsKeyWord {
    public static void main(String[] args) {
        // нечётные от 1 до 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Нечётное " + i);
        }

        int x = 0;
        while (true) {
            x = x +3;
            System.out.println(x);
            if (x >=10){
                break;
            }
        }
    }

}

