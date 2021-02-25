package Java_basics.Strings_String;

import java.util.Scanner;

public class Comparing_strings_ignoring_whitespaces {
    public static void main(String[] args) {
        /**
         * Write a program that reads two lines and compares them without whitespaces. The program should print true if both lines are equal, otherwise – false.
         *
         *  Report a typo
         * Sample Input 1:
         *
         *   string
         * str ing
         * Sample Output 1:
         * true
         * Sample Input 2:
         * string
         * my string
         * Sample Output 2:
         * false
         */

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String string1 = scanner.nextLine();
        System.out.println(string.replace(" ", "").equals(string1.replace(" ", "")));

        /*
        这一题与之前几题都是使用了Java内置String的函数，需要我们熟悉相关函数的使用
         */
    }
}
