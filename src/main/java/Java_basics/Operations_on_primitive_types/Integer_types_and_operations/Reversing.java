package Java_basics.Operations_on_primitive_types.Integer_types_and_operations;

import org.junit.Test;

import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        /**
         * Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.
         *
         * Sample Input 1:
         * 320
         *
         * Sample Output 1:
         * 23
         *
         * Sample Input 2:
         * 976
         *
         * Sample Output 2:
         * 679
         */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);

        /*
        这一题比较难，或者说有较大的思维障碍，我们首先应该明白，数字的十进制格式，可以通过取余%对数值从高位开始，逐步向下取值，并且与取余值进行拼接（商*10+余数），并持续迭代至数据为零，逐步返回值后完成迭代得到翻转数据
         */

        Scanner scanner1 = new Scanner(System.in);
        String input = scanner.next();
        String reverse1 = new StringBuilder(input).reverse().toString();
        int output = Integer.parseInt(reverse1);
        System.out.println(output);

        /*
        理解以上代码需要补充以下知识

        public StringBuffer reverse()
        将此字符序列用其反转形式取代。
        在使用 StringBuffer 类时，每次都会对 StringBuffer 对象本身进行操作，而不是生成新的对象，所以如果需要对字符串进行修改推荐使用 StringBuffer。

        StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。

        由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
         */
    }
}
