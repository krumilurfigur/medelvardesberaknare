/*
a program that calculates the mean of 10 numbers
2019-11-21
Gabriel Öberg
 */

import java.util.Scanner;

public class mean10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Double[] numbers = new Double [10];
        Double n;
        Double m;

        System.out.println("Enter the first of your ten numbers");
        for (int i = 0; i < 10; i++) {
            n = kb.nextDouble();
            numbers[i] = n;
            System.out.println("Enter another number");
        }
        m = (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9])/10;
        System.out.println(m);
    }
}