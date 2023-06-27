package com.hillel.lesson5.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        do {
            System.out.println("Scanner " + scaner.hasNextInt());
        }
        while (scaner.hasNextInt());
    }

}
