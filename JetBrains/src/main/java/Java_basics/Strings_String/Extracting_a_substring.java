package Java_basics.Strings_String;

import java.util.Scanner;

public class Extracting_a_substring {
    public static void main(String[] args) {
        /**
         * Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both. Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.
         *
         * Sample Input 1:
         * Java
         * 0 2
         *
         * Sample Output 1:
         * Jav
         */

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(string.substring(num1, ++num2));

        /*
        此题解法和上一题类似，所以都是通过使用Java内置函数来完成相关操作，因此我们应该熟悉一下Java常用方法
         */
    }
}
