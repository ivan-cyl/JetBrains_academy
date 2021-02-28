package Java_basics.Control_flow_statements.The_for_loop;

import java.util.Scanner;

public class Arithmetic_average {
    public static void main(String[] args) {
        /**
         * Write a program that reads two numbers aa and bb from the keyboard and calculates and outputs to the console the arithmetic average of all numbers from the interval [a; b][a;b], which are divisible by 33.
         *
         * In the example below, the arithmetic average is calculated for the numbers on the interval [-5; 12][−5;12]. Total numbers divisible by 33 on this interval 66: -3, 0, 3, 6, 9, 12−3,0,3,6,9,12. Their arithmetic average equals to 4.54.5
         *
         * The program input contains intervals, which always contain at least one number, which is divisible by 33.
         *
         * Remember that int type cannot contain fractions. Use double variable to store the precise result of the division.
         *
         * Sample Input 1:
         * -5
         * 12
         * Sample Output 1:
         * 4.5
         */

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        float sum = 0;
        float num = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0) {
                num++;
                sum += i;
            }
        }
        System.out.println(sum / num);

        /*
        此题使用for语句与if语句嵌套，实现该问题
         */
    }
}
