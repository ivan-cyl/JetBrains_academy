package Java_basics.Operations_on_primitive_types.Increment_and_decrement;

import java.util.Scanner;

public class Increment_and_decrement {
    public static void main(String[] args) {
        /**
         * Write a program that reads four numbers and decrements each of them.
         * The program must output the results in the same order separated by spaces.
         *
         * Sample Input 1:
         * 10 11 -2 -3
         *
         * Sample Output 1:
         * 9 10 -3 -4
         */

        int n = 4;
        int[] ints = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ints[i]--;
            System.out.print(ints[i] + " ");
        }

        /*
        可行方案有很多，但是有一些其他的解决方案
         */

        Scanner scanner1 = new Scanner(System.in);
        // put your code here
        for (int i = 0; i < 4; i++) {
            int num = scanner1.nextInt();
            --num;
            System.out.print(num + " ");
        }
    }
}
