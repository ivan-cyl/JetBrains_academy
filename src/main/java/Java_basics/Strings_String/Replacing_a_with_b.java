package Java_basics.Strings_String;

import java.util.Scanner;

public class Replacing_a_with_b {
    public static void main(String[] args) {
        /**
         * Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
         *
         * The program should print out the resulting string.
         *
         * Sample Input 1:
         * aaa
         *
         * Sample Output 1:
         * bbb
         *
         * Sample Input 2:
         * bca
         *
         * Sample Output 2:
         * bcb
         */
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string.replace('a', 'b'));

        /*
        此题开始时，我们可能会想要使用各种各样的做法来解决这个问题，实际上我们只需要完成对Java内置函数的使用即可完成此题
         */
    }
}
