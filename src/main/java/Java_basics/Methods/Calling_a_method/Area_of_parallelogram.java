package Java_basics.Methods.Calling_a_method;

import java.util.Scanner;

public class Area_of_parallelogram {
    public static void main(String[] args) {
        /**
         * According to the formula, the area of a parallelogram is a result of the multiplication of the base and the height of the figure. Call the method countAreaOfParallelogram that calculates the area of the parallelogram with the following parameters bb and hh.
         *
         * Sample Input 1:
         * 8 10
         *
         * Sample Output 1:
         * 80
         */

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        countAreaOfParallelogram(num1, num2);

        /*
        此题用于演示如何调用自己搭建的方法
         */

        Scanner scanner1 = new Scanner(System.in);
        String[] arguments = scanner1.nextLine().trim().split(" ");
        int h = Integer.parseInt(arguments[0]);
        int b = Integer.parseInt(arguments[1]);
        countAreaOfParallelogram(b, h);

        /*
        这种做法，我感觉有一种自己搞自己心态的方法，但也是可行的
         */
    }

    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
