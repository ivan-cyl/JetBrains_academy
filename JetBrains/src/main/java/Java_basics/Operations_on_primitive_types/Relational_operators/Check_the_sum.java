package Java_basics.Operations_on_primitive_types.Relational_operators;

import java.util.Scanner;

public class Check_the_sum {
    public static void main(String[] args) {
        /**
         * Write a program that reads the numbers a, b, c and checks if there's a pair of them that adds up to exactly 20.
         * The program must output true or false.
         *
         * Sample Input 1:
         * 1 2 3
         *
         * Sample Output 1:
         * false
         *
         * Sample Input 2:
         * 4 16 7
         *
         * Sample Output 2:
         * true
         */
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println(number1 + number2 == 20 || number1 + number3 == 20 || number2 + number3 == 20);

        /*
        吸取上一题的思想，并不需要使用if语句进行判断然后输出结果，语句本身就返回判断结果，我差一点又犯了同一错误
         */
    }
}
