package com.elvin.multiplefragmentdemo;

/**
 * @author Elvin Shrestha on 04/12/19
 */
public class Operation {

    public static float areaOfCircle(float radius) {
        return (float) Math.PI * radius * radius;
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num % 10 != 0) {
            reverse = reverse * 10 + (num % 10);
            num = num / 10;
        }
        return reverse;
    }

    public static boolean palindromeNumber(int number) {
        return number == reverseNumber(number);
    }

    public static String reverseString(String string) {
        return new StringBuffer(string).reverse().toString();
    }

}
