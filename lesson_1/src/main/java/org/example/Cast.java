package org.example;

public class Cast {
    public static void main(String[] args) {
        //char
        char a = 'a';
        //integers
        byte b = 106;
        short sh = 240;
        int i = 555;
        long l = 75842343552452L;
        //pointed
        float f = 10.1234567f;
        double d = 11.1234567890123456d;


        int castByteToInt = b;
        System.out.println(castByteToInt);

        int castShotrToInt = sh;
        System.out.println(castShotrToInt);

        double castFloatToDouble = f;
        System.out.println(castFloatToDouble);

        float castDoubleToFloat = (float) d;
        System.out.println(castDoubleToFloat);

        int castFloatToInt = (int) f;
        System.out.println(castFloatToInt);

    }

}
