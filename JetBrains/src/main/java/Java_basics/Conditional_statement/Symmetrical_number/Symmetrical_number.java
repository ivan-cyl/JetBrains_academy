package Java_basics.Conditional_statement.Symmetrical_number;

import java.util.Scanner;

public class Symmetrical_number {
    public static void main(String[] args) {
        /**
         * Given a four-digit number. Determine whether its decimal notation is symmetric. If the number is symmetric, output 1; otherwise output any other integer.
         *
         * Sample Input 1:
         * 2002
         *
         * Sample Output 1:
         * 1
         *
         * Sample Input 2:
         * 2008
         *
         * Sample Output 2:
         * 37
         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number1 = number;
        int re = 0;
        while (number != 0) {
            re = number % 10 + re * 10;
            number = number / 10;

        }
        if (number1 == re) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        /*
        此方法是利用了之前题目中扭转数字的方法，这个方法非常巧妙，而且时间空间复杂度都较低分别为O(n)和O(1),但是难以想到，我们解决该需求的第一步首先是获取数字中的当数字，那么我们就可以有两种方法来解决该需求，取余%和整除/，取余是获得低位数字，而整除是获得高位数字。而且整除获得的数字是随着除数位数的增大的减少，而取余则相反，随着除数位数的增大而结果位数而增大。为了保证程序的低耦合性和高拓展性，我们无法预知数字位数，那么就难以取得最大的位数来获得最小位数的结果，那么取余获得数字的方式就很棒的方式就是编写好程序的方法。通过取余后结果位数的递增（*10）加上下一次递归的余数，从而逆转数字
         */

        Scanner scanner1 = new Scanner(System.in);
        String s = scanner1.next();
        System.out.println((s.charAt(0) == s.charAt(3) && s.charAt(1) == s.charAt(2)) ? 1 : 0);

        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner.nextInt();
        int firstDigit = number % 10;
        int secondDigit = (number % 100) / 10;
        int thirdDigit = (number % 1000) / 100;
        int fourthDigit = number / 1000;
        if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        /*
        以上的两种方法虽然都可以实现该问题，但是过于粗糙，可读性并没有很大优势，应该避免，但是使用charAt方法却很有新意
        charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
         */
    }
}
