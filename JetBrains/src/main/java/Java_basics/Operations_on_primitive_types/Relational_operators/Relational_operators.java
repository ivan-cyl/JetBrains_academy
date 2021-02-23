package Java_basics.Operations_on_primitive_types.Relational_operators;

import java.util.Scanner;

public class Relational_operators {
    public static void main(String[] args) {
        /**
         * Write a program that reads an integer value and checks if it is less than 10 and greater than 0.
         * Your program should print a boolean value (true or false).
         *
         * Sample Input 1:
         * 0
         *
         * Sample Output 1:
         * false
         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0 && number < 10) {
            System.out.println("true");
        } else System.out.println("false");

        /*
        我们可以使用三目运算符进行简化
         */

        Scanner scanner2 = new Scanner(System.in);
        int n = scanner2.nextInt();
        System.out.println(n < 10 && n > 0 ? "true" : "false");


        /*
        无论是使用if语句，还是三目运算符进行判断，这虽然是一个简单的方法，但是我却忽略了非常重要的一点，判断语句本身返回值本就是Boolean，而我却手动的对Boolean进行手动输出，是非常愚蠢的问题，我们应该尽可能避免这样的 问题发生
         */

        Scanner scanner1 = new Scanner(System.in);
        // put your code here
        int number1 = scanner1.nextInt();
        System.out.println(number1 > 0 && number1 < 10);
    }
}
